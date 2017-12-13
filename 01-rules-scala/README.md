# 01 Rules Scala

In this exercise, the target `scala_example` is of type `scala_library` rule, but `rules_scala` is not used so the build fails with message:
```
Error:(1, 1) name 'scala_library' is not defined (did you mean 'java_library'?).
```

Please refer to the [getting started section](https://github.com/bazelbuild/rules_scala#getting-started) of `rules_scala` in order to fix the issue
