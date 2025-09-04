node {
    try {
        echo 'Starting the pipeline...'

        // Make sure the repo is cloned into workspace
        checkout scm

        // Load the Groovy script from vars/
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
