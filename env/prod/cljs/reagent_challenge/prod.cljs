(ns reagent-challenge.prod
  (:require [reagent-challenge.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
