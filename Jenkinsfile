pipeline{
    agent any

    // Get maven home path
    def mvnHome = tool name: 'maven-3', type: 'maven'

    stages{

        stage('Checkout') {
          steps{
            git 'https://github.com/KonecKonca/scalaJenkinsTest.git'
          }
        }

        stage('Compile') {
          steps{
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