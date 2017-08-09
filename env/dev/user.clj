(ns user
  (:require [figwheel-sidecar.repl-api]))

(defn start-test-ui! []
  (figwheel-sidecar.repl-api/start-figwheel!
    (figwheel-sidecar.config/fetch-config)
    "test-ui")
  (figwheel-sidecar.repl-api/cljs-repl "test-ui"))

(comment
  (start-test-ui!)
  (figwheel-sidecar.repl-api/stop-figwheel!))