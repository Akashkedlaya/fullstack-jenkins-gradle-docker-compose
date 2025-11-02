FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY . /app


# Build with Gradle wrapper (we'll add wrapper quickly)
RUN ./gradlew clean bootJar --no-daemon


EXPOSE 8080
ENTRYPOINT ["java","-jar","build/libs/demo-0.0.1.jar"]
