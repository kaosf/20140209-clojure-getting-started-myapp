(defproject myapp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/math.combinatorics "0.0.6"]
                 [mylib/mylib "0.1.0-SNAPSHOT"]]
  :main ^:skip-aot myapp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
