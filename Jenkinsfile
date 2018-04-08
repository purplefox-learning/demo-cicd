#!/usr/bin/env groovy

pipeline {
    //agent { node { label 'linux' } }
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    println 'hello build'
                    bat 'gradlew --info build -x test'
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    library "jenkins-pipeline-lib-core@master"  //standard way to import a library
                    println 'hello package'
                    gradleBuild(tasks: 'clean build', level: 'info', test:'true')
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