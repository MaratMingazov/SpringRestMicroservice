FROM openjdk:11
ADD target/docker-jar.jar docker-jar.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "docker-jar.jar"]