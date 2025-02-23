# Simple use of Spring Boot Basic security - Auth Server

In this example we have 2 folders.  This folder is the authentication server for logging in and obtaining the JWT token to use the resources for the service.

The **basic-jwt-resource** folder is the service that will require the JWT token.

The credentials for this example are:

- username: steve
  password: password
- username: admin
  password: admin
- username: noone
  password: secret

This time the user information are read from a csv file called **credentials.csv**.  In the BasicConfig.java you will see how the file is loaded into the in memory user manager to determine if the user is valid.  You can change the FileReader for a database query instead to load the user details in.

This example also has a test, that passes the authentication header for basic auth and checks the return value.

The noone user has no authority and will be granted a JWT but will not be allowed to view as it has no roles.

## The files

AppController.java  
This file is the API requests of /api/hello and /api/health

BasicConfig.java  
Contains the security chain which defines which pages can be accessed and how.

SecurityApplication.java  
The starting point

## Running the app

You can run the code using

```
./mvnw spring-boot:run
```

Alternatively compile the code

```
./mvnw clean package
```

Then run it

```
java -jar target/security-0.0.1.jar
```

## Using the app

### Using **Postman**

#### Getting an error

Let's see it error first.

In the URL ensure you have **POST** selected and type in the following URL:

```
localhost:9000/login
```

In the **Auth** tab select **Basic Authentication** and set the user name to one of the users mentioned at the beginning of this document.

If you have provided the correct username and password you will be returned a JWT string.

You can use this JWT token in the **basic-jwt-resource** application.