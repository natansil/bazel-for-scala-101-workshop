# 04 Strict Deps

In this exercise, the build of target `a` fails due to missing direct dependency on target `c`.

Error message:
```
error: Target '//src/main/scala/com/example:c' is used but isn't explicitly declared, please add it to the deps.
You can use the following buildozer command:
buildozer 'add deps //src/main/scala/com/example:c' //src/main/scala/com/example:a
```

The current **target** dependency graph is `a -> b -> c` 

while the **code** dependnecy graph is 

`A.scala -> B.scala`

`A.scala -> C.scala`

`B.scala -> C.scala`

In contrast with Maven's transitive dependency resolution "magic", when working Bazel, for each target, all of its dependencies should be explictly declared.

The target graph should mimic the code graph in order to fix the build failure.

For more information, please read the [Blog post on java rules](https://blog.bazel.build/2017/06/28/sjd-unused_deps.html) and [scala_rules readme section](https://github.com/bazelbuild/rules_scala#experimental-using-strict-deps) 
