# build
FROM maven:latest AS build
WORKDIR /app
COPY pom.xml .
COPY src/ src/
RUN mvn package

# copy the built app
FROM openjdk:latest
WORKDIR /app
COPY --from=build /app/target/laba.jar .
EXPOSE 8080
CMD ["java", "-jar", "laba.jar"]
