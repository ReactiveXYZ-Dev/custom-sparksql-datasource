pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                MY_PROJ_DIR=$(pwd);
                git clone git@github.com:johnynek/bazel-deps.git;
                cd bazel-deps;
                bazel run //:parse generate -- --repo-root "$MY_PROJ_DIR" --sha-file 3rdparty/workspace.bzl --deps dependencies.yaml;
                cd ..;
                Bazel build //:App;
                '''
            }
        }

        stage('Test') {
            steps {
                sh '''bazel test $(bazel query 'kind(".*_test rule", //...)')'''
            }
        }
    }
}