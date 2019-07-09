node{

    stage('Checkout') {
      git 'https://github.com/KonecKonca/scalaJenkinsTest.git'
    }

    stage('Compile-Package') {
      // Get maven home path
      def mvnHome = tool name: 'maven-3', type: 'maven'

      sh "${mvnHome}/bin/mvn package"
    }

}