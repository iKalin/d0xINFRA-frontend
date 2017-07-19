(defproject district0x "0.1.18"
  :description "district0x Frontend Library"
  :url "https://github.com/district0x/d0xINFRA-frontend"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[akiroz.re-frame/storage "0.1.2"]
                 [bidi "2.1.1"]
                 [cljs-ajax "0.5.8"]
                 [cljs-react-material-ui "0.2.43"]
                 [cljsjs/bignumber "2.1.4-1"]
                 [cljsjs/react-flexbox-grid "1.0.0-0" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [cljsjs/react-highlight "1.0.5-0" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [cljsjs/react-truncate "2.0.3-0"]
                 [cljsjs/react-ultimate-pagination "0.8.0-0" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [com.andrewmcveigh/cljs-time "0.4.0"]
                 [com.cemerick/url "0.1.1"]
                 [day8.re-frame/async-flow-fx "0.0.6"]
                 [day8.re-frame/http-fx "0.1.3"]
                 [kibu/pushy "0.3.6"]
                 [madvas.re-frame/google-analytics-fx "0.1.0"]
                 [madvas.re-frame/web3-fx "0.1.12"]
                 [madvas/reagent-patched "0.6.1" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [medley "0.8.3"]
                 [org.clojure/clojurescript "1.9.671"]
                 [print-foo-cljs "2.0.3"]
                 [re-frame "0.9.4" :exclusions [reagent]]])
