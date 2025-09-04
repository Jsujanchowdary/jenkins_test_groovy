// Import the shared library. 'my-jenkins-library' is the name you configure in Jenkins.
@Library('my-jenkins-library') _

pipeline {
    agent any

    stages {
        // Now you just call the functions defined in myStages.groovy
        // Jenkins makes the filename 'myStages' available as a global variable.
        setupfile.cloneSource()
        setupfile.buildApplication()
        // You would create and call functions for your other stages (Test, Deploy) here as well.
    }

    post {
        always {
            echo 'Pipeline has finished executing.'
        }
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Please check the logs.'
        }
    }
}