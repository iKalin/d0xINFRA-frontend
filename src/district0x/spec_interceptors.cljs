(ns district0x.spec-interceptors
  (:require
    [cljs.spec.alpha :as s]
    [re-frame.core :as re-frame :refer [console]]))

(defn error-message [event untrimmed-event spec]
  (console :error "Invalid input into event" (or untrimmed-event event) "\n" (s/explain-str spec event)))

(defn validate-db [spec]
  (re-frame/->interceptor
    :id :validate-db
    :after (fn [{{:keys [:event :re-frame.std-interceptors/untrimmed-event]} :coeffects
                 {:keys [:db]} :effects :as context}]
             (when (and goog.DEBUG db (not (s/valid? spec db)))
               (console :error "DB is invalid after event" (or untrimmed-event event) "\n" (s/explain-str spec db)))
             context)))

(defn validate-args [spec]
  (re-frame/->interceptor
    :id :validate-args
    :before (fn [{{:keys [:event :re-frame.std-interceptors/untrimmed-event]} :coeffects :as context}]
              (if (s/valid? spec event)
                context
                (error-message event untrimmed-event spec)))))

(defn conform-args [spec]
  (re-frame/->interceptor
    :id :conform-args
    :before (fn [{{:keys [:event :re-frame.std-interceptors/untrimmed-event]} :coeffects :as context}]
              (let [conformed (s/conform spec event)]
                (if (not= conformed ::s/invalid)
                  (update context :coeffects merge (merge {:event [conformed]
                                                           ::unconformed-event event}))
                  (error-message event untrimmed-event spec))))))
