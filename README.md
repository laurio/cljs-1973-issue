# cljs-1973-issue

Minimal repo to reproduce an issue when there are
multiple entries in `:foreign-libs` with the same `:file` value
which provide different modules.

## Usage

Build your project with the following script:

    ./scripts/build

You should see the following errors:

````
Building ...
Exception in thread "main" clojure.lang.ExceptionInfo: failed compiling file:src/cljs_1973_issue/app.cljs {:file #object[java.io.File 0xc3114ea "src/cljs_1973_issue/app.cljs"]}, compiling:(/Users/laurioherd/dev/cljs-1973-issue/scripts/build.clj:5:1)
        at clojure.lang.Compiler.load(Compiler.java:7391)
        at clojure.lang.Compiler.loadFile(Compiler.java:7317)
        at clojure.main$load_script.invokeStatic(main.clj:275)
        at clojure.main$script_opt.invokeStatic(main.clj:335)
        at clojure.main$script_opt.invoke(main.clj:330)
        at clojure.main$main.invokeStatic(main.clj:421)
        at clojure.main$main.doInvoke(main.clj:384)
        at clojure.lang.RestFn.invoke(RestFn.java:408)
        at clojure.lang.Var.invoke(Var.java:379)
        at clojure.lang.AFn.applyToHelper(AFn.java:154)
        at clojure.lang.Var.applyTo(Var.java:700)
        at clojure.main.main(main.java:37)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at clojure.lang.Reflector.invokeMatchingMethod(Reflector.java:93)
        at clojure.lang.Reflector.invokeStaticMethod(Reflector.java:207)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at clojure.lang.Reflector.invokeMatchingMethod(Reflector.java:93)
        at clojure.lang.Reflector.invokeStaticMethod(Reflector.java:207)
        at user$eval5.invokeStatic(form-init3070536885205298397.clj:1)
        at user$eval5.invoke(form-init3070536885205298397.clj:1)
        at clojure.lang.Compiler.eval(Compiler.java:6927)
        at clojure.lang.Compiler.eval(Compiler.java:6917)
        at clojure.lang.Compiler.load(Compiler.java:7379)
        at clojure.lang.Compiler.loadFile(Compiler.java:7317)
        at clojure.main$load_script.invokeStatic(main.clj:275)
        at clojure.main$init_opt.invokeStatic(main.clj:277)
        at clojure.main$init_opt.invoke(main.clj:277)
        at clojure.main$initialize.invokeStatic(main.clj:308)
        at clojure.main$null_opt.invokeStatic(main.clj:342)
        at clojure.main$null_opt.invoke(main.clj:339)
        at clojure.main$main.invokeStatic(main.clj:421)
        at clojure.main$main.doInvoke(main.clj:384)
        at clojure.lang.RestFn.invoke(RestFn.java:421)
        at clojure.lang.Var.invoke(Var.java:383)
        at clojure.lang.AFn.applyToHelper(AFn.java:156)
        at clojure.lang.Var.applyTo(Var.java:700)
        at clojure.main.main(main.java:37)
Caused by: clojure.lang.ExceptionInfo: failed compiling file:src/cljs_1973_issue/app.cljs {:file #object[java.io.File 0xc3114ea "src/cljs_1973_issue/app.cljs"]}
        at clojure.core$ex_info.invokeStatic(core.clj:4617)
        at clojure.core$ex_info.invoke(core.clj:4617)
        at cljs.compiler$compile_file$fn__3742.invoke(compiler.cljc:1443)
        at cljs.compiler$compile_file.invokeStatic(compiler.cljc:1408)
        at cljs.compiler$compile_file.invoke(compiler.cljc:1384)
        at cljs.closure$compile_file.invokeStatic(closure.clj:488)
        at cljs.closure$compile_file.invoke(closure.clj:479)
        at cljs.closure$eval5532$fn__5533.invoke(closure.clj:557)
        at cljs.closure$eval5468$fn__5469$G__5457__5476.invoke(closure.clj:441)
        at cljs.closure$compile_sources$iter__5668__5672$fn__5673.invoke(closure.clj:905)
        at clojure.lang.LazySeq.sval(LazySeq.java:40)
        at clojure.lang.LazySeq.seq(LazySeq.java:49)
        at clojure.lang.Cons.next(Cons.java:39)
        at clojure.lang.RT.next(RT.java:688)
        at clojure.core$next__4341.invokeStatic(core.clj:64)
        at clojure.core$dorun.invokeStatic(core.clj:3033)
        at clojure.core$doall.invokeStatic(core.clj:3039)
        at clojure.core$doall.invoke(core.clj:3039)
        at cljs.closure$compile_sources.invokeStatic(closure.clj:899)
        at cljs.closure$compile_sources.invoke(closure.clj:888)
        at cljs.closure$build.invokeStatic(closure.clj:2285)
        at cljs.closure$build.invoke(closure.clj:2217)
        at cljs.build.api$build.invokeStatic(api.clj:202)
        at cljs.build.api$build.invoke(api.clj:189)
        at cljs.build.api$build.invokeStatic(api.clj:192)
        at cljs.build.api$build.invoke(api.clj:189)
        at user$eval6355.invokeStatic(build.clj:6)
        at user$eval6355.invoke(build.clj:5)
        at clojure.lang.Compiler.eval(Compiler.java:6927)
        at clojure.lang.Compiler.load(Compiler.java:7379)
        ... 42 more
Caused by: clojure.lang.ExceptionInfo: No such namespace: cljsjs.pikaday, could not locate cljsjs/pikaday.cljs, cljsjs/pikaday.cljc, or Closure namespace "cljsjs.pikaday" in file src/cljs_1973_issue/app.cljs {:tag :cljs/analysis-error}
        at clojure.core$ex_info.invokeStatic(core.clj:4617)
        at clojure.core$ex_info.invoke(core.clj:4617)
        at cljs.analyzer$error.invokeStatic(analyzer.cljc:645)
        at cljs.analyzer$error.invoke(analyzer.cljc:641)
        at cljs.analyzer$error.invokeStatic(analyzer.cljc:643)
        at cljs.analyzer$error.invoke(analyzer.cljc:641)
        at cljs.analyzer$analyze_deps.invokeStatic(analyzer.cljc:1894)
        at cljs.analyzer$analyze_deps.invoke(analyzer.cljc:1870)
        at cljs.analyzer$ns_side_effects.invokeStatic(analyzer.cljc:3132)
        at cljs.analyzer$ns_side_effects.invoke(analyzer.cljc:3127)
        at cljs.analyzer$analyze_STAR_$fn__2652.invoke(analyzer.cljc:3224)
        at clojure.lang.PersistentVector.reduce(PersistentVector.java:341)
        at clojure.core$reduce.invokeStatic(core.clj:6544)
        at clojure.core$reduce.invoke(core.clj:6527)
        at cljs.analyzer$analyze_STAR_.invokeStatic(analyzer.cljc:3224)
        at cljs.analyzer$analyze_STAR_.invoke(analyzer.cljc:3214)
        at cljs.analyzer$analyze.invokeStatic(analyzer.cljc:3242)
        at cljs.analyzer$analyze.invoke(analyzer.cljc:3226)
        at cljs.compiler$emit_source.invokeStatic(compiler.cljc:1279)
        at cljs.compiler$emit_source.invoke(compiler.cljc:1259)
        at cljs.compiler$compile_file_STAR_$fn__3719.invoke(compiler.cljc:1353)
        at cljs.compiler$with_core_cljs.invokeStatic(compiler.cljc:1178)
        at cljs.compiler$with_core_cljs.invoke(compiler.cljc:1167)
        at cljs.compiler$compile_file_STAR_.invokeStatic(compiler.cljc:1342)
        at cljs.compiler$compile_file_STAR_.invoke(compiler.cljc:1335)
        at cljs.compiler$compile_file$fn__3742.invoke(compiler.cljc:1431)
        ... 69 more
````

## Explanation

The `deps.cljs` file in `cljsjs/pikaday` module has the following declaration:
````
{:foreign-libs [{:file "cljsjs/pikaday/development/pikaday.inc.js"
                 :provides ["cljsjs.pikaday"]
                 :file-min "cljsjs/pikaday/production/pikaday.min.inc.js"}
                {:file "cljsjs/pikaday/development/pikaday.inc.js"
                 :file-min "cljsjs/pikaday/production/pikaday.min.inc.js"
                 :requires ["cljsjs.moment"]
                 :provides ["cljsjs.pikaday.with-moment"]}]
 :externs ["cljsjs/pikaday/common/pikaday.ext.js"]}
````
cljs-1973 patch transforms[1] the `:foreign-libs` value to
````
  [{:file "cljsjs/pikaday/development/pikaday.inc.js"
    :file-min "cljsjs/pikaday/production/pikaday.min.inc.js"
    :requires ["cljsjs.moment"]
    :provides ["cljsjs.pikaday.with-moment"]}]
````
(it drops the entry which `:provides` ["cljsjs.pikaday"])
while before it was left unmodified.

In order to successfully compile the project downgrade ClojureScript dependency to previous release version "1.9.456"
and build with:
    
        ./scripts/build
    
You should see:
    
````
Building ...
... done. Elapsed 0.906024192 seconds
````

[1] https://github.com/clojure/clojurescript/commit/21da03e03e229a0b38fb872485d26a30fbf034b8#diff-84ffd22349e5ca1fe6322cb0e379b3b1L1949

## License

Copyright © 2017 Lauri Oherd

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
