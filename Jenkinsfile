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
                    bat 'gradlew build'
                    junit 'reports/**/*.xml'
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    println 'hello package'
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