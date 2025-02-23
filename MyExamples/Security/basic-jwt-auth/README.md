# Simple use of Spring Boot Basic security - Auth Server

In this example we have 2 folders.  This folder is the authentication server for logging in and obtaining the JWT token to use the resources for the service.

The **basic-jwt-resource** folder is the service that will require the JWT token.

The credentials for this example are:

- username: steve
  password: password
- username: admin
  password: admin

This time the user information are read from a csv file called **credentials.csv**.  In the BasicConfig.java you will see how the file is loaded into the in memory user manager to determine if the user is valid.  You can change the FileReader for a database query instead to load the user details in.

This example also has a test, that passes the authentication header for basic auth and checks the return value.

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

In the URL ensure you have **GET** selected and type in the following URL:

```
localhost:8080/api/hello
```

Press **Send**

You should receive a **401 Unauthorized** in the bottom window.

#### Adding authorization

Now select the **Authorization** tab below the address.

Click on **No Auth** pull down for the **Type** field.

Select **Basic Auth**.

The username and password are no longer used from the **application.properties** file but instead are located int he BasicConfig.java file are set to **admin** and **admin**.  NOTE: We would not normally do this, as it is insecure.  Ideally you would read the usernames and passwords from a database and then compare.  It is possible to load your users into memory for the application, but that would be poor performance if you have 100s and 1000s of users.

Type the username and password into the corresponding boxes:

Username: admin
Password: admin

Click **Send**

You should now see the text **Welcome. Your role is ROLE_ADMIN, ROLE_USER** in the bottom box.

If you change the credentials to:

Username: users
Password: password

Click **Send**

You should now see the text **Welcome. Your role is ROLE_USER** in the bottom box.

## Summary

This is Spring Boot the absolute basic authentication using spring boot.

If you were to type the URL in a web browser Spring Boot will pop up an authentication box to type in the username and password, but we're interested in REST APIs, so this is how we would authenticate.