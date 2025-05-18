# Stage 1: Build the application
FROM maven:3.9-eclipse-temurin-17 AS build

# Set the working directory
WORKDIR /app

# Copy pom.xml 
COPY pom.xml .

# Copy source code
COPY src/ /app/src/

# Use dependency hash value as cache ID identifier for better cache management
# A new cache is automatically created when pom.xml changes
COPY pom.xml pom.xml.checksum
RUN md5sum pom.xml > pom.xml.checksum

# Build the application (with cache mount support)
RUN --mount=type=cache,target=/root/.m2,id=maven-deps-spring-boot-rest-api-sample \
    mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/spring-boot-3-rest-api-sample-1.0-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
