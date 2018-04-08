#!/usr/bin/env groovy

pipeline {
    //agent { node { label 'linux' } }
    agent any

    stages {
        stage('Initialize') {
            steps {
                script {
                    bat 'echo welcome to the little CICD world...'
                    println 'initializing for cicd build...'
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    library "jenkins-pipeline-lib-core@master"  //standard way to import a library
                    gradleBuild(tasks: 'clean build', outputLevel: 'info', includeTest:'false')
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    println 'dummy package'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    println 'dummy deploy'
                }
            }
        }
    }
}