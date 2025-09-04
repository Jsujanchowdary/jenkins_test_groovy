// vars/setupfile.groovy

def cloneSource() {
    echo "Cloning the repository..."
    sh 'git clone https://github.com/Jsujanchowdary/jenkins_test_groovy.git'
}

def buildApplication() {
    echo "Building the application..."
    sh 'echo "Simulating build process..."'
}
