FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} score.jar
ENTRYPOINT ["java","-jar","/score.jar"]