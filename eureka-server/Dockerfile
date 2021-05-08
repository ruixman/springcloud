FROM hub.c.163.com/library/java:8-jre
##FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/eurekaServer-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT [ "java", "-jar", "/app.jar" ]