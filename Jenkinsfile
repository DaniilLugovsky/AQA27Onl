pipeline {
    agent any

    tools {
        maven "M3"
    }

    parameters {
        gitParameter branchFilter: 'origin/(.*)', defaultValue: 'CI_CD', name: 'BRANCH', type: 'PT_BRANCH'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${params.BRANCH}", url: 'https://github.com/DaniilLugovsky/AQA27Onl.git'
            }
        }
        stage('Test') {
            steps {
                bat "mvn clean test"
            }
        }
    }
}