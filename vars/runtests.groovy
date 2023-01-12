def call(Map config = [:]) {
    sh "echo Runnning tests for ${config.environment}"
}