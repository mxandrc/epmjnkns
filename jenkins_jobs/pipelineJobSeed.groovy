pipelineJob("sample-app-pipeline-job") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/mxandrc/epmjnkns.git')
                        credentials('jenkins-github')
                    }
                    branch('master')
                }
            }
            scriptPath("jenkins_jobs/pipelineJob.groovy")
        }
    }
}
