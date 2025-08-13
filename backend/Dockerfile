# ---------- Build Stage ----------
FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /app
# Copy pom and source together to avoid stale cached dependency:go-offline layer issues
COPY pom.xml .
COPY src ./src
# Ensure clean build and force plugin/dependency update (-U)
RUN mvn -B -U -DskipTests clean package

# ---------- Runtime Stage ----------
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
# Copy only the built artifact
COPY --from=build /app/target/airline-order-backend-0.0.1-SNAPSHOT.jar app.jar
# Expose port (optional documentation)
EXPOSE 8080
# JVM options can be overridden via JAVA_OPTS
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
