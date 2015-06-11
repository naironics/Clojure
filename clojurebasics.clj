;; declaring a namespace for this project
(ns clojurebasics)

;; regular printing of Hello World to console
(print "Hello World")

;; addition
(+ 1 1)

;; subtraction
(- 6 9)

;; division
(/ 3 6)

;; multiplication
(* 34 23)

;; nested functions
(* 123 (+ 23 45))

;; defining an anonymous function
(fn [] (str "I am an anonymous function"))

;; calling an anonymous function in line
((fn [name] (str "Hello " name)) "John")

;; Binding anonymous function to a symbol

(def greet (fn [name] (str "Hello " name)))

;; calling greet function

(greet "Micheal")

;; shorthand for defining function

(defn greeter [name]
  (str "Hello " name))

;; calling greeter function

(greeter "Tony")