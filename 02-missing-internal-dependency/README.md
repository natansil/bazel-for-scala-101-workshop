# 02 Missing internal dependency

In this exercise, the build of target `scala_example_test` fails due to missing dependency on `scala_example` target (its label is missing from the deps list).
Please add the missing dependency (see reference on label structure [here](https://docs.google.com/presentation/d/1Pvki8Ve5CP-NliEWDPOjRKAes4qMsIGAPCzurMb8VJs/edit#slide=id.g2b2c4b2cce_0_54) and [here](https://docs.bazel.build/versions/master/build-ref.html#labels))
