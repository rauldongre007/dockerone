pipeline{
    agent any
    tools{
        maven 'maven_3.8.8'
    }
    stages{
        stage ('Version checking'){
            steps{
                    echo 'check java version'
                    sh 'java -version'
                    echo 'Java version checked'
                    }
        }
           stage ('Git version'){
            steps{
                    echo 'check GIT version'
                    sh 'git --version'
                    echo 'GIT version checked'
                    }
        }
       stage('Code packaging'){
            steps{
                    echo 'Code packaging starting'
                    sh 'mvn clean package'
                    echo 'code packaged'
                    }
       }

    }
}



