#!/usr/bin/env groovy

pipeline {
    //agent { node { label 'linux' } }
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    println 'hello build'
                    bat 'gradlew build --info'
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    library "jenkins-pipeline-lib-core"
                    println 'hello package'
                    testLib("some-args")
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    println 'hello deploy'
                }
            }
        }
    }
}