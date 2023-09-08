pipeline{

    agent {
        docker {
            image "alpine"
        }
    }

    stages{

        stage('access-google-home'){
            steps{
                sh "wget www.google.com"
            }
        }              

    }

    post {
        always {
            archiveArtifacts artifacts: 'index.html', followSymlinks: false
        }
    }

}