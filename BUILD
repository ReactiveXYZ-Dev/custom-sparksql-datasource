load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")
scala_binary(
    name = "App",
    deps = [
        "//runner"
    ],
    main_class = "xyz.reactive.spark.runner.CustomDataSourceApp"
)