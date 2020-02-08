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
        }
	    stage('UnitTest') {
            steps {
		    step([$class: 'JacocoPublisher', 
			      execPattern: 'target/*.exec',
			      classPattern: 'target/classes',
			      sourcePattern: 'src/main/java',
			      exclusionPattern: 'src/test*'
			])
            }
        }
    }
}
