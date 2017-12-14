# 06 Test Size

In this exercise, running `bazel test //...` fails due to TIMEOUT of tests in `scala_example_test` target

timeout message:
```
TIMEOUT: //src/test/scala/com/example:scala_example_test (Summary)
      /private/var/tmp/_bazel_natans/f60d0c3d9de39d0df60c43bf6e9eb658/execroot/__main__/bazel-out/darwin-fastbuild/testlogs/src/test/scala/com/example/scala_example_test/test.log
INFO: Elapsed time: 67.217s, Critical Path: 67.07s
INFO: Build completed, 1 test FAILED, 4 total actions
//src/test/scala/com/example:scala_example_test                         TIMEOUT in 61.1s
```

Please change the `size` of the `test` target in order to resolve the issue

[test size resource](https://docs.bazel.build/versions/master/test-encyclopedia.html#role-of-the-test-runner) - look at `size/Implied timeout label
` table
