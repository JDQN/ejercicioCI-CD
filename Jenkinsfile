pipeline {
    agent any
    stages {
        stage('Ejecutar Prueba') {
            steps {
                script {
                    // Este es el mensaje que se mostrará en la consola de Jenkins
                    def mensaje = "¡Hola, mundo desde Jenkins! \n\nProyecto: ${env.JOB_NAME} \nVersión: ${env.BUILD_NUMBER}"
                    echo mensaje

                    // Retrasar la ejecución del pipeline por 1 minuto
                    timer(delay: 60000)

                    // Imprimir los números del 1 al 10
                    for (int i = 1; i <= 10; i++) {
                        echo i
                    }
                }
            }
        }

        stage('Ejecutar Comando') {
            steps {
                sh 'echo "Este es un comando real"'
            }
        }
    }

    post {
        success {
            script {
                // Enviar un correo electrónico con los resultados del pipeline
                mail to: 'developers@example.com', subject: 'Resultados del pipeline', body: 'El pipeline se completó con éxito.'

                // Crear un registro de la ejecución del pipeline
                writeFile file: 'pipeline.log', text: "${env.BUILD_LOG}"
            }
        }
    }
}
