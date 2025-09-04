node {
    try {
        echo 'Starting the pipeline...'

        // Make sure repo is checked out
        checkout scm

        // Load your groovy helper
        def setupfile = load 'vars/setupfile.groovy'

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
