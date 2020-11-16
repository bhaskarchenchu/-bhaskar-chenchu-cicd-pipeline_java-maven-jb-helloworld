@Library('sharedlib') _
pipeline {
    agent any

    options {
        disableConcurrentBuilds()
        buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '15'))
    }

    stages {
        stage("Build") {
            steps {
              echo(greet("private cloud"))
            }
        }
    }
}