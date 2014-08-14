(defproject demo "0.2.0-SNAPSHOT"
  :description "Demo of Immutant 2.x libraries"
  :url "http://github.com/immutant/feature-demo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.immutant/immutant "2.x.incremental.219"]
                 ;; [org.immutant/immutant "2.0.0-SNAPSHOT"]
                 [ring/ring-core "1.3.0"]
                 [ring/ring-devel "1.3.0"]
                 [org.clojure/core.memoize "0.5.6"]
                 [clj-time "0.7.0"]
                 [cheshire "5.3.1"]
                 [ring/ring-session-timeout "0.1.0"]]
  :plugins [[lein-immutant "2.0.0-SNAPSHOT"]]
  :repositories [["Immutant 2.x incremental builds"
                  "http://downloads.immutant.org/incremental/"]]
  :main demo.core
  :aliases {"msg-client" ["run" "-m" "demo.remote-messaging-client"]}
  :profiles {:uberjar {:aot :all}})
