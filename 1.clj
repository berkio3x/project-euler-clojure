(defn problem-1
    [n]
    (reduce + (filter #(or (zero? (mod % 3)) (zero? (mod % 5)) ) (range 10000)))
)
(problem-1 1000)