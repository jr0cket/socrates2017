# Socrates 2017 - Clojure & Haskell kata night

Results of a coding exercise at Socrates 2017, tackling the _recently used list_ kata.

This kata was interpreted as a song list, something like spotify.  The most recent song playing is at the start of the list.  The list of songs is unique, so no song appears in the list more than once.

Two teams, one Clojure and one Haskell solved this kata using a TDD approach.  This is the code from the Clojure team


## Kata: Recently Used List

Develop a recently-used-list class to hold strings uniquely in Last-In-First-Out order.

- The most recently added item is first, the least recently added item is last.

- Items can be looked up by index, which counts from zero.

- Items in the list are unique, so duplicate insertions are moved rather than added.

- A recently-used-list is initially empty.

Optional extras:

- Null insertions (empty strings) are not allowed.

- A bounded capacity can be specified, so there is an upper limit to the number of items contained, with the least recently added items dropped on overflow.
	   

## Usage

Run the tests using the following terminal command:

```bash
lein test
```

Run the tests in Emacs / Spacemacs using `M-x cider-test-run-all-tests`


The code has only been writen to run in the repl

## License

Copyright © 2017 jr0cket

Distributed under the Creative Commons Attribution-ShareAlike 4.0 International

<a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/"><img alt="Creative Commons Licence" style="border-width:0" src="https://i.creativecommons.org/l/by-sa/4.0/88x31.png" /></a><br />This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-sa/4.0/">Creative Commons Attribution-ShareAlike 4.0 International License</a>.
