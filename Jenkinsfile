pipeline {
    agent {
                docker { image 'maven:3-alpine' }
        }
    stages {
        stage('Build') {
            steps {
               sh 'mvn -B -DskipTests clean package'
	           archiveArtifacts 'target/*.jar'
            }
	    stage('UnitTest') {
            steps {
                sh './jenkins_build.sh'
                junit '*/build/test-results/*.xml'
                step( [ $class: 'JacocoPublisher' ] )
                }
            }
        }
    }
}
