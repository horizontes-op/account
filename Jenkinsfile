pipeline {
    agent any
    stages {
        stage('acount interface') {
            steps {
                echo 'acount interface'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}