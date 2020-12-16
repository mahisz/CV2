pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/pawel3ak/selenium-training.git', branch: 'master')
      }
    }

    stage('Maven build') {
      steps {
        sh '''echo %cd% 
cd C:\\Repositories\\training-sda\\selenium-training
echo %cd%
mvn test'''
      }
    }

  }
  environment {
    BRANCH = 'master'
  }
}