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