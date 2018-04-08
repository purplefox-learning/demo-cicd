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
                    println 'hello build'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    //junit 'reports/**/*.xml'
                    println 'hello test'
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