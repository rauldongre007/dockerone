pipeline{
    tools{
        maven 'maven_3.8.6'
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
                    sh 'mvn clean compile 2'
                    echo 'code complied'
                    }
       }

    }
}



