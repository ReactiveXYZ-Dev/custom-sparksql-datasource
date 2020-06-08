load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")
 
scala_library(
   name = "runner",
   srcs = ["src/main/scala/CustomDataSourceApp.scala"],
   deps = [
       "//dummy-data-source",
   ],
   visibility = ["//:__pkg__"]
)
 
scala_test(
    name = "test-main",
    srcs = ["src/test/scala/MainSpec.scala"],
    deps = [":runner"]
)
