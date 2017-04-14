(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
           {:main       'cljs_1973_issue.app
            :output-to  "out/app.js"
            :output-dir "out"})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))


