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
                  // Get maven home path
                  def mvnHome = tool name: 'maven-3', type: 'maven'
            sh "${mvnHome}/bin/mvn compile"
          }
        }

        stage('Test') {
          steps{
                  // Get maven home path
                  def mvnHome = tool name: 'maven-3', type: 'maven'
            sh "${mvnHome}/bin/mvn test"
          }
        }

    }

}