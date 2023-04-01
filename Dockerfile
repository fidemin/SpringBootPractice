FROM gradle:7.6.1-jdk8 AS build-image
RUN mkdir /app
COPY . /app
WORKDIR /app
RUN ./gradlew bootJar

FROM openjdk:8-jdk-slim
EXPOSE 10006
COPY --from=build-image /app/build/libs/spring-boot-practice.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]