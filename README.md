# Custom Spark DataSource Pratice

The current data source logic is mostly borrowed from [here](https://github.com/aokolnychyi/spark-custom-datasource-example).

## How to run?
1. Make sure Spark is installed and started up locally
2. Follow [this](https://github.com/johnynek/bazel-deps) to install 3rd party dependencies using the `dependencies.yaml` file
3. `$ bazel run //:App` to run the sample data source driver

## What else?
1. Bazel build support (Done)
2. Use Bazel build as data source (TODO)
3. Use Jenkins as data source (TODO)