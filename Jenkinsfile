def mvnHome = 'Undefined'

pipeline{
    agent any
    stages{
        stage('Checkout') {
          steps{
            git 'https://github.com/KonecKonca/scalaJenkinsTest.git'
          }
        }
        stage('Compile') {
          steps{
            script{
              mvnHome = tool name: 'maven-3', type: 'maven'
            }
            sh "${mvnHome}/bin/mvn compile"
          }
        }
        stage('Test') {
          steps{
            sh "${mvnHome}/bin/mvn test"
          }
        }
    }
}