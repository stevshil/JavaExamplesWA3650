# To run this script you must set the execution policy
# Set-ExecutionPolicy -ExecutionPolicy unrestricted -scope currentuser

# Run the tests
echo "Running the tests"
if (! (mvn test) ) {
    Write-Host -ForegroundColor Red "Tests failed";
    exit 1
} else {
    Write-Host -ForegroundColor Green "Tests passed";
    Write-Host -NoNewLine 'Check the tests have passed and press any key to continue...';
    $null = $Host.UI.RawUI.ReadKey('NoEcho,IncludeKeyDown');
}

# Package the project
echo "Packaging the project"
mvn -DskipTests=true clean package
# Gradle
# .\gradlew clean build
# If you have mvnw
# .\mvnw clean package

# Run the project
echo "Running the project"
java -jar target\demo-0.0.1-SNAPSHOT.jar