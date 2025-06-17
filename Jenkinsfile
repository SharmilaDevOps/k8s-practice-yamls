
pipeline {
    agent any

    environment {
        IMAGE_NAME = 'nginx-demo'
        DOCKERHUB_USER = 'your-dockerhub-username'
    }

    stages {
        stage('Clone Repo') {
            steps {
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $IMAGE_NAME:latest ./kubernetes/'
            }
        }

        stage('Push to DockerHub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh '''
                      echo $PASS | docker login -u $USER --password-stdin
                      docker tag $IMAGE_NAME:latest $USER/$IMAGE_NAME:latest
                      docker push $USER/$IMAGE_NAME:latest
                    '''
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f kubernetes/nginx-deployment.yaml'
            }
        }
    }
}
