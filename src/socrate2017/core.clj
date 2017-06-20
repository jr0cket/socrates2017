(ns socrate2017.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(def recent-songs [])

(defn add-song [song song-list]
  (cons song-list song))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; REPL Driven Development

;; (cons "Daft Punk - Get Lucky" recent-songs)

;; (add-song "Daft Punk - Get Lucky" recent-songs)



;; can we add a value to a collection that so that each new value is at the start of the list

(cons 1 '())
;; => (1)

(cons 1 '(2))
;; => (1 2)

(cons 2 '(3 4 5))
;; => (2 3 4 5)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Can I look up a list by index, eg. using (nth list-name 0)

(nth '(1 2 3 4 5) 1)
;; => 2


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Which collections are not unique

;; No...
(list 1 2 3 2 1)          ;; => (1 2 3 2 1)

;; sets
;; yes, but are not ordered
(set '(1 2 3 4 3 2 1))    ;; => #{1 4 3 2}

;; what if we add to a set
;; cons seems to consistently add values to the front of the set
;; sets will not allow duplicates to be added
;; still need remove the existing value from the position (if its not the first position)
(cons 6
      (cons 5 #{1 4 3 2}))
;; => (6 5 1 4 3 2)


;; sorted sets
;; actually we dont want clojure to order things for us though
;; seems a sorted set is not unique either
(sorted-set '(1 2 3 4 3 2 1))
;; => #{(1 2 3 4 3 2 1)}

