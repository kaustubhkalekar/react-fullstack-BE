FROM adoptopenjdk/openjdk11:jre-11.0.6_10-alpine
ENV PORT 9001
ENV CLASSPATH /opt/lib
EXPOSE 9001

COPY pom.xml target/lib* /opt/lib/

COPY target/*.jar /opt/app.jar
WORKDIR /opt

CMD ["java", "-jar","app.jar"]

