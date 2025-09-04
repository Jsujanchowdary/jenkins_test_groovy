// Jenkinsfile (Scripted Pipeline)

node {
    try {
        echo 'Starting the pipeline...'

        // Call functions from vars/setupfile.groovy
        setupfile.cloneSource()
        setupfile.buildApplication()
        setupfile.testApplication()
        setupfile.deployApplication()

        echo 'Pipeline finished successfully!'
    } catch (err) {
        echo "Pipeline failed: ${err}"
        currentBuild.result = 'FAILURE'
        throw err
    } finally {
        // Optional cleanup
        echo 'Pipeline execution finished.'
    }
}
