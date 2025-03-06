def call (){
  echo "Pushing the Docker image to DockerHub"
  withCredentials([usernamePassword(credentialsId: "dockerHubCred", passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUser")]) {
  sh 'docker login -u ${dockerHubUser} -p ${dockerHubPass}'
                    // sh 'docker tag node-app:latest diwanvasim/node-app:latest'
  sh 'docker push ${DOCKER_NAME}:${DOCKER_TAG}'
}
