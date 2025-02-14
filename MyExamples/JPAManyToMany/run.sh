#!/bin/bash

# Running the tests
echo "Running the tests..."
mvn test
# Gradle command: ./gradlew test
echo 'Check the tests have passed and press any key to continue...'
read REPLY

# Build my Jar file
echo "Building the project..."
mvn -DskipTests=true clean package
# Gradle command: ./gradlew build

# Run my Jar file
echo "Review the README.md for endpoints and examples"
echo "Running the project..."
java -jar target/demo-0.0.1-SNAPSHOT.jar