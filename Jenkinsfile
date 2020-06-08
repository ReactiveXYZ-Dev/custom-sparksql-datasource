pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'Bazel build //:App' 
            }
        }

        stage('Test') {
            steps {
                sh '''bazel test $(bazel query 'kind(".*_test rule", //...)')'''
            }
        }
    }
}