# 05 Package visibility

In this exercise, the build of target `scala_example_test` fails due to its dependency on `scala_example` target not being `visible` (also the package where `scala_example` is defined as a whole is not visible to the outside).

Failure message:
```
Error:(3, 1) Target '//src/main/scala/com/example:scala_example' is not visible from target '//src/test/scala/com/example:scala_example_test'. Check the visibility declaration of the former target if you think the dependency is legitimate.
```
Please change the `visibilty` of the `target` or the `package`.

[target visibility resource](https://docs.bazel.build/versions/master/be/common-definitions.html) - search for `visibiity`

[package visibility resource](https://docs.bazel.build/versions/master/be/functions.html#package)
