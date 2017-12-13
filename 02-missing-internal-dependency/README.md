# 02 Missing internal dependency

In this exercise, the build of target `scala_example_test` fails due to missing dependency on `scala_example` target (its label is missing from the deps list).

Failure message:
```
Error:(3, 1) Couldn't build file src/test/scala/com/example/scala_example_test.jar: scala //src/test/scala/com/example:scala_example_test failed (Exit 1).
```
Please add the missing dependency label.

Remember that a label consists of two parts:

`//src/main/scala/com/foo:bar`

a package name (`src/main/scala/com/foo`) and a target name (`bar`)

The package name is the relative location of the package from the workspace root


(see reference on label structure [here](https://docs.bazel.build/versions/master/build-ref.html#labels))
