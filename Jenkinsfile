pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '5'))
        disableConcurrentBuilds()
    }

    stages {
        stage('Checkout del codigo') {
            steps {
                // Puedes agregar aquí la configuración para obtener el código fuente
                // desde un sistema de control de versiones como Git
                // Por ejemplo:
                git branch: 'main', url: 'https://github.com/JDQN/ejercicioCI-CD.git'
            }
        }

        stage('Ejecutar Prueba') {
            steps {
                script {
                    def mensaje = 'Hola, mundo desde Jenkins'
                    echo mensaje

                    // Aquí puedes agregar comandos para ejecutar tus pruebas
                    // por ejemplo:
                    // sh 'npm install'
                    // sh 'npm test'
                }
            }
        }
    }

    post {
        success {
            echo 'La prueba se ha ejecutado exitosamente.'
            // Puedes agregar aquí acciones adicionales si la prueba es exitosa
        }
        failure {
            echo 'La prueba ha fallado.'
            // Puedes agregar aquí acciones adicionales si la prueba falla
        }
        always {
            echo 'Finalizando el trabajo.'
        }
    }
}
