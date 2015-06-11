(ns typesinclojure)


;; java.lang.Long , by default it is Long in clojure and not int
(type 13)

;; java.lang.Double , by default it is double and not float
(type 12.34)

;; java.lang.Boolean
(type true)

;; java.lang.String
(type "saome string")

;; java.lang.Character
(type \f)

;;clojure.lang.Keyword
(type :keyword)

;; clojure.lang.Keyword   using the keyword macro to create a keyword , note keyword isn't a function here, but a macro
(type (keyword "keyword"))

;; clojure.lang.Symbol
(type 'a)

;; another way to create clojure.lang.Symbol
(type (quote a))


;; using quote to avoid evaluation of the list (1 2 3), here the type if clojure.lang.PersistentList, list is like linkedlist
(type '(1 2 3))

;; clojure.lang.PersistentList$EmptyList
(type ())

;; shorthand for above
(type (list 1 2 3))


;; clojure.lang.PersistentVector
(type [1 2 3])

;; shorthand for above
(type (vector 1 2 3))


;; clojure.lang.PersistentArrayMap, they preserve order, but does not have performance for larger data sets
(type {:a 1 :b 23})

;; defaulting to hash-map instead of Array Map , clojure.lang.PersistentHashMap is better in performance
(type (hash-map :a 12 :b 23))

;; clojure.lang.PersistentHashSet
(type #{1 2 3})

;; shorthand for above
(type (hash-set 1 2 3))


