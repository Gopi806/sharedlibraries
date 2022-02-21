def newGit(repo)
{
  git "${repo}" 
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ip,appname)
{
  "deploy adapters: [tomcat9(credentialsId: '93c02cb2-03f4-4be0-bb78-57e3403d891a', path: '', url: 'http://${ip}')], contextPath: '${appname}', war: '**/*.war"
}
def runSelenium(path)
{
  sh "java -jar ${path}/testing.jar"
}
  
