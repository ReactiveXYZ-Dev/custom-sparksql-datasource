load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")
 
scala_library(
   name = "runner",
   srcs = ["src/main/scala/runner/CustomDataSourceApp.scala"],
   deps = [
       "//data-source",
   ],
   visibility = ["//:__pkg__"]
)
 
scala_test(
    name = "test-main",
    srcs = ["src/test/scala/runner/MainSpec.scala"],
    deps = [":runner"]
)
