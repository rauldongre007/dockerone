pipeline{
    agent {
            node {
                label "master"  //change this as per your agent label
            }
    }
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
                    sh 'mvn clean compile'
                    echo 'code complied'
                    }
       }

    }
}
