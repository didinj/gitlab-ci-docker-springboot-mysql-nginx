FROM openjdk:11
LABEL maintainer="didin@djamware.com"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myspringbootapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-jar","myspringbootapp-0.0.1-SNAPSHOT.jar"]
