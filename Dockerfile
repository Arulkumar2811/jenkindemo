FROM openjdk:21
EXPOSE 8484
ADD target/jenkindemo.jar jenkindemo.jar
ENTRYPOINT ["java", "-jar", "/jenkindemo.jar"]