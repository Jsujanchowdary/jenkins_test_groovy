// This script defines reusable pipeline stages

// A function for the 'Clone Source' stage
def cloneSource() {
    stage('Clone Source') {
        steps {
            echo 'This stage is cloning a git repository from the shared library.'
            sh 'echo "Running git clone command..."'
        }
    }
}

// A function for the 'Build' stage
def buildApplication() {
    stage('Build') {
        steps {
            echo 'This stage is for building the application.'
            sh 'echo "Running build scripts..."'
            sh 'echo "Build complete!"'
        }
    }
}