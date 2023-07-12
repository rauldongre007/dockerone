pipeline{
    agent any
    tools{
        maven 'maven_3.8.8'
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
                    echo 'Code packaging starting'
                    sh 'mvn clean package'
                    echo 'code packaged'
                    }
       }

    }
}



