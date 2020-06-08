pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                    MY_PROJ_DIR=$(pwd);
                    if [ ! -d "$MY_PROJ_DIR/bazel-deps" ]
                    then
                        git clone git@github.com:johnynek/bazel-deps.git;
                    fi
                    cd bazel-deps;
                    bazel run //:parse generate -- --repo-root "$MY_PROJ_DIR" --sha-file 3rdparty/workspace.bzl --deps dependencies.yaml;
                    cd ..;
                    bazel build //:App;
                    rm -rf ./bazel-deps;
                   '''
            }
        }

        stage('Test') {
            steps {
                sh '''
                    bazel test $(bazel query 'kind(".*_test rule", //...)')
                   '''
            }
        }
    }
}