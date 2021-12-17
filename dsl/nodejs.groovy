job('Node.js Docker Example') {
    scm {
        git('git://github.com/munawar-netsol/Create-Docker-Image-for-Node-DSL.git') { node ->
            node / gitConfigName('munawersheikh.')
            node / gitConfigEmail('munawersheikh@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * * *')
    }
    wrappers {
        nodejs('Node.js Latest')
    }
    steps {
        dockerBuildAndPublish {
			repositoryName('munawersheikh/docker-node-js-image-dsl')
			registryCredentials('munawersheikh/******')
			forcePull(false)
			forceTag(false)
			createFingerprints(false)
			skipDecorate()
		}
    }
}