(ns myapp.core
  (:gen-class)
  (:require [clojure.math.combinatorics :as combo]))

(defn -main
  "I don't do a whole lot ... yet."
  [x y]
  (println "Hello, World!")
  (println
    (str "x = " x ", y = " y ", xCy = "
      (count (combo/combinations (range 0 (Integer. x)) (Integer. y))))))
