def cloneSource() {
    echo 'This stage is cloning a git repository from the shared library.'
    sh 'echo "Running git clone command..."'
}

def buildApplication() {
    echo 'This stage is for building the application.'
    sh 'echo "Running build scripts..."'
    sh 'echo "Build complete!"'
}

