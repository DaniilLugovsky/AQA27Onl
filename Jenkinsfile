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
    }
}