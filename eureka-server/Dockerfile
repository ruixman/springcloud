FROM java:8
VOLUME /tmp
ADD demo.jar app.jar #demo为项目名称
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app.jar" ]