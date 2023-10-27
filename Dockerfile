FROM gradle:8.4-jdk21-alpine as builder
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon --stacktrace

FROM eclipse-temurin:21-jre-alpine

EXPOSE 8080

RUN mkdir /app

COPY --from=builder /home/gradle/src/build/libs/*.jar /app/spring-boot-application.jar

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=default","/app/spring-boot-application.jar"]