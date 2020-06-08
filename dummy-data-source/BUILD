load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_test")
 
scala_library(
   name = "dummy-data-source",
   srcs = glob(["src/main/scala/*.scala"]),
   deps = [
       "//3rdparty/jvm/org/apache/spark:spark_core",
       "//3rdparty/jvm/org/apache/spark:spark_sql"
   ],
   visibility = ["//runner:__pkg__"]
)
 
scala_test(
    name = "test-main",
    srcs = ["src/test/scala/MainSpec.scala"],
    deps = [":data-source"]
)
