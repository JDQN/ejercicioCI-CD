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
                      sleep(time: 60, unit: 'SECONDS')

                      // Imprimir los números del 1 al 10
                      for (int i = 1; i <= 10; i++) {
                          echo i
                }
            }
        }
    }

    post {
        success {
            echo 'La prueba se ha ejecutado exitosamente.'
        }
    }
