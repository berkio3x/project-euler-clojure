(defn fib-lazy []
    (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))
   

(print
    (reduce + 
        (filter even?(take-while #(< % 4000000 ) (fib-lazy))))
)
