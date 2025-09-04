node {
    try {
        echo 'Starting the pipeline...'

        // Load the setupfile.groovy script manually
        def setupfile = load 'vars/setupfile.groovy'

        // Call the functions
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
        echo 'Pipeline execution finished.'
    }
}
