pipeline {
    agent any
        stages
        {            
            stage('Four') {
                parallel {
                    stage('Unit Testing') {
                        steps {
                            echo 'Running the unit Testing!'
                        }
                    }
                    stage('Integration Testing') {
                        agent {
                            dockerfile {
                                filename 'Dockerfile'
                            }
                        }
                        steps {
                            echo 'Running the Integration Testing!'
                        }
                    }
                }
            }
        }
}