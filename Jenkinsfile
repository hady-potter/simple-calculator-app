pipeline {
    agent any

    environment {
        APP_NAME = "calculator-app"
        JAR_FILE = "target/calculator-0.0.1-SNAPSHOT.jar"
    }

    stages {
        stage('Checkout') {
            steps {
                // Replace with your HTTPS GitHub URL
                git branch: 'main', url: 'https://github.com/YOUR_USERNAME/calculator-app.git'
            }
        }

        stage('Build') {
            steps {
                echo "Building the project..."
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo "Running tests..."
                sh 'mvn test'
            }
        }

        stage('Deploy (Simulation)') {
            steps {
                echo "Deploying application (simulation)..."
                // Stop any existing app
                sh 'pkill -f calculator || true'
                // Start new app in background
                sh "nohup java -jar ${JAR_FILE} > app.log 2>&1 &"
                echo "Application deployed! Access it at http://localhost:8080/add?a=1&b=2"
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully!"
        }
        failure {
            echo "Pipeline failed!"
        }
    }
}
