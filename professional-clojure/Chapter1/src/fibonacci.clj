(ns fibbonacci)
(def fib
  (memoize (fn [n]
             (cond
               (= n 0) 0
               (= n 1) 1
               :else (+ (fib (- n 1))
                        (fib (- n 2)))))))
(defn side-effects [n] 
  (print (time n)))

(side-effects (fib 100))