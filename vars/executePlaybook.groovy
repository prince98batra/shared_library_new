def call() {
    def config = loadConfig()  

    pipeline {
        stages {
            stage('Execute Playbook') {
                steps {
                    script {
                        sh "ansible-playbook -i home/ubuntu/inventory ${config.home/ubuntu/playbook.yml"
                    }
                }
            }
        }
    }
}
