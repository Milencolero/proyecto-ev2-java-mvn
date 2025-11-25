pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Tests') {
            steps {
                sh 'mvn -B test'
            }
        }
    }

    post {
        always {
            echo "Pipeline finalizado"
        }
    }
}
