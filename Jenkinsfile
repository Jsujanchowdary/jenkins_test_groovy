node {
    try {
        echo 'Starting the pipeline...'

        // Checkout Jenkinsfile repo
        checkout scm

        // Load groovy helper
        def setupfile = load 'setupfile.groovy'

        // Call functions
        setupfile.cloneSource()
        setupfile.buildApplication()

        echo 'Pipeline finished successfully!'
    } catch (err) {
        echo "Pipeline failed: ${err}"
        currentBuild.result = 'FAILURE'
        throw err
    } finally {
        echo 'Pipeline execution finished.'
    }
}
