pipeline {
    agent any

    stages {
        stage('Ejecutar Prueba') {
            steps {
                script {
                    // Este es el mensaje que se mostrará en la consola de Jenkins
                    def mensaje = '¡Hola, mundo desde Jenkins!'
                    echo mensaje

                    def minutos = 1

                    while (true) {
                        sleep time: minutos * 60, unit: 'SECONDS'
                        echo "After ${minutos} minute, print: ${minutos}"
                        minutos++
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'La prueba se ha ejecutado exitosamente.'
        }
    }
}
