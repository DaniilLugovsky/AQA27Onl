pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "CI_CD", url: 'https://github.com/DaniilLugovsky/AQA27Onl.git'
            }
        }
        stage('Test') {
            steps {
                bat "mvn clean test"
            }
        }

        post {
                        // If Maven was able to run the tests, even if some of the test
                        // failed, record the test results and archive the jar file.
                        success {
                            allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
                        }

    }
}