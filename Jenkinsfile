pipeline {
    agent any

    options {
        // Agregar una descripción al trabajo
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '5'))
        disableConcurrentBuilds()
    }

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
        failure {
            echo 'La prueba ha fallado.'
        }
    }
}
