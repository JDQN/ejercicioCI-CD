pipeline {
    agent any

    triggers {
        cron('*/1 * * * *') // Ejecutar cada minuto
    }

    stages {
        stage('Checkout del codigo') {
            steps {
                git branch: 'main', url: 'https://github.com/JDQN/ejercicioCI-CD.git'
            }
        }

        stage('Ejecutar Prueba') {
            steps {
                script {
                    currentBuild.displayName = "Ejecución #${currentBuild.number}"
                    echo "Número de ejecución: ${currentBuild.number}"
                }
            }
        }
    }

    post {
        success {
            echo 'La prueba se ha ejecutado exitosamente.'
        }
        failure {
            echo 'La prueba ha fallado.'
        }
        always {
            echo 'Finalizando el trabajo.'
        }
    }
}
