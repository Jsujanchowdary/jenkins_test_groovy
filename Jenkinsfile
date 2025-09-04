node {
    try {
        echo 'Starting the pipeline...'

        // No "load" needed — Jenkins automatically exposes vars/*.groovy
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
