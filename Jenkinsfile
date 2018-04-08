#!/usr/bin/env groovy

pipeline {
    //agent { node { label 'linux' } }
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    //library "edmi-pipeline-lib-core@${branchName}"
                    //edmiBuild(tasks: 'clean build dockerBuild')
                    cmd 'echo aaa'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    junit 'reports/**/*.xml'
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                }
            }
        }
    }
}