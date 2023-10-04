pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                // Limpia el proyecto
                sh 'mvn clean'

                // Ejecuta las pruebas
                sh 'mvn test'
            }
        }
    }
}
