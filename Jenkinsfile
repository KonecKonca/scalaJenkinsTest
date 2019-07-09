node{

     // Get maven home path
      def mvnHome = tool name: 'maven-3', type: 'maven'

    stage('Checkout') {
      git 'https://github.com/KonecKonca/scalaJenkinsTest.git'
    }

    stage('Compile') {
      sh "${mvnHome}/bin/mvn compile"
    }

    stage('Test') {
      sh "${mvnHome}/bin/mvn test"
    }

}