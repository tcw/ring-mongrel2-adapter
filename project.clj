(defproject org.clojars.tcw/ring-mongrel2-adapter "0.1.0-SNAPSHOT"
  :description "Ring Mongrel2 adapter."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [cheshire "5.0.1"]
                 [slingshot "0.10.3"]
                 [commons-httpclient/commons-httpclient "3.1"]
                 [org.jeromq/jeromq "0.2.0"]
                 [speclj "2.1.2"]]
  :plugins [[speclj "2.1.2"]]
  :test-paths ["spec/"])
