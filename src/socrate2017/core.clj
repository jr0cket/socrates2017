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
