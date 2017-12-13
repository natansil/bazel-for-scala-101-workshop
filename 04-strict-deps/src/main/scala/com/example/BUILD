package(default_visibility = ["//visibility:public"])
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test", "scala_binary")

scala_library(
    name="a",
    srcs=[
        "A.scala",
        ],
    deps = ["b", "c"],    
)

scala_library(
    name="b",
    srcs=[
        "B.scala",
        ],
    deps = ["c"],
)

scala_library(
    name="c",
    srcs=[
        "C.scala",
        ],
)