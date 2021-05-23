(ns squares)
(defn square [a] (* a a))
(defn sum-of-squares [a b] (+ (square a) (square b)))
(defn run [opts]
  (println "(sum-of-squares 4 5):" (sum-of-squares 4 5)))