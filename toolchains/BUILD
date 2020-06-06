load("@io_bazel_rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")

scala_toolchain(
    name = "my_toolchain_impl",
    dependency_mode = "transitive",
    strict_deps_mode = "off",
    unused_dependency_checker_mode = "off",
    dependency_tracking_method = "high-level",
)

toolchain(
    name = "my_scala_toolchain",
    toolchain_type = "@io_bazel_rules_scala//scala:toolchain_type",
    toolchain = "my_toolchain_impl",
    visibility = ["//visibility:public"]
)