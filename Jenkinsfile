pipeline {
  agent {
    docker {
      image 'alpine'
    }

  }
  stages {
    stage('inicio') {
      steps {
        waitUntil() {
          sh 'echo \'holq\''
        }

      }
    }

  }
}