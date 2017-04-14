(ns cljs-1973-issue.app
  (:require [cljsjs.pikaday]))

(enable-console-print!)

(js/Pikaday. (clj->js {:field      "hello"
                       :reposition false
                       :onSelect   #()}))
