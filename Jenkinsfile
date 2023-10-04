pipeline {
    agent any

    stages {
        stage('Ejecutar Prueba') {
            steps {
                script {
                       // Este es el mensaje que se mostrará en la consola de Jenkins
                       def mensaje = '¡Hola, mundo desde Jenkins!'
                       echo mensaje
                }
            }
        }
    }

    post {
        success {
            echo 'La prueba se ha ejecutado exitosamente.'
        }
    }
