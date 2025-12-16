# ============================
# Base image with JDK 21
# ============================
FROM eclipse-temurin:21-jdk

# Install Maven
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Set working directory
WORKDIR /app

# Copy project files
COPY pom.xml .
COPY src ./src

# Build Spring Boot application
RUN mvn clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "target/myapp.jar"]