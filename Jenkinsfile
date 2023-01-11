pipeline{
    
    options {
	buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }
    agent any
    
    tools{
        maven 'maven-3.8.7'
    }
    stages{
        stage ('Code compilation'){
            steps{
                    echo 'Code compilation starting'
                    sh 'mvn clean compile'
                    echo 'code complied'
                    }
        }
       stage('Code packaging'){
            steps{
                    echo 'Code compilation starting'
                    sh 'mvn clean package'
                    echo 'code complied'
                    }
       }

    }
}
