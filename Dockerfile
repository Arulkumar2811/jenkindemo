FROM openjdk:21
EXPOSE 8585
ADD target/DockerDemo.jar DockerDemo.jar
ENTRYPOINT ["java", "-jar", "/DockerDemo.jar"]