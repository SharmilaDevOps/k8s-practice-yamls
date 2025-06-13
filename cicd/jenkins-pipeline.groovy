pipeline {
    agent any

    environment {
        APP_NAME = "my-k8s-app"
    }

    stages {
        stage('Checkout') {
            steps {
                echo '✅ Checking out code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo '🔨 Building application...'
                sh 'echo Build logic here'
            }
        }

        stage('Test') {
            steps {
                echo '🧪 Running tests...'
                sh 'echo Test logic here'
            }
        }

        stage('Docker Build & Push') {
            steps {
                echo '🐳 Building Docker image...'
                sh 'docker build -t $APP_NAME .'
                echo '📤 Pushing Docker image...'
                // sh 'docker push <your-registry>/$APP_NAME'
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                echo '🚀 Deploying to Kubernetes...'
                // sh 'kubectl apply -f kubernetes/'
            }
        }
    }

    post {
        success {
            echo '🎉 Pipeline completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed.'
        }
    }
}
