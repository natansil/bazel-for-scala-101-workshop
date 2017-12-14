# bazel-101-workshop

## pre-requisites

Follow the instructions of this [manual](https://docs.google.com/document/d/1nd2OodffEIr676o_oKRF7kWJ5s83lR_FvAp_f698MUw/edit)

## general guidelines

Open each exercise seperatly (on intellij or any other ide/editor you prefer)
First run `bazel build //... --experimental_repository_cache="/tmp"` to see the failure, before you try to solve the issue

(Note: Each exercise is in a completely indepedant bazel workspace (which means dependency repo fetching could have ocurred for each exercise)
`experimental_repository_cache` speeds up fetching by caching `rules_scala` repo for all workspaces)

## Exercises
1. [rules_scala](https://github.com/natansil/bazel-101-workshop/tree/master/01-rules-scala)
2. [missing internal dependency](https://github.com/natansil/bazel-101-workshop/tree/master/02-missing-internal-dependency)
3. [missing external dependency](https://github.com/natansil/bazel-101-workshop/tree/master/03-missing-external-dependency)
4. [strict deps failure](https://github.com/natansil/bazel-101-workshop/tree/master/04-strict-deps)
5. [visibility](https://github.com/natansil/bazel-101-workshop/tree/master/05-package-visibility)
6. [test size](https://github.com/natansil/bazel-101-workshop/tree/master/06-test-size)
