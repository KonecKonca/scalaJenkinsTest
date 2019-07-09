node{

    stage('Checkout') {
      git 'https://github.com/KonecKonca/scalaJenkinsTest.git'
    }

    stage('Compile-Package') {
      sh 'mvn package'
    }

}