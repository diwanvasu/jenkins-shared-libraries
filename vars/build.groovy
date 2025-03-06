def call(){
echo "Building the code"
sh 'docker build -t ${DOCKER_NAME}:${DOCKER_TAG} .'

}
