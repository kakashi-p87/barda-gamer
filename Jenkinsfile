node{
    stage('git clone'){
        git 'https://github.com/kakashi-p87/barda-gamer'
    }

    stage('build'){
        sh 'mvn package'
    }

    stage('archival'){
        publishHTML([allowMissing: true, alwaysLinkToLastBuild: false, keepAll: true, reportDir: 'target/site/jacoco/', reportFiles: 'index.html', reportName: 'Code coverage', reportTitles: ''])
        archiveArtifacts 'target/*.jar'
        step([$class: 'JUnitResultArchiver', testResults: 'target/surefire-reports/TEST-*.xml'])

    }

}