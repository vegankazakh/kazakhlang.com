#Use Openjdk as the base IMAGE
FROM eclipse-temurin:21-jdk

RUN groupadd spring && useradd -m -g spring spring
USER spring:spring

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

#Run the SB application
ENTRYPOINT ["java", "-jar", "/app.jar"]
