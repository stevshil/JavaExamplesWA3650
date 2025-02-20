# Simple use of Spring Boot Basic security

In this example we simply use the default user in the application.properties file.

The application.properties file contains a bcrypted version of the word **password**. In your REST header for BASIC AUTH you simply pass the unencrypted version. The application code uses the bcrypt encoder/decoder to work out the password.

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

The username and password are in the **application.properties** file and are set to **admin** and **password**.

Type the username and password into the corresponding boxes:

Username: admin
Password: password

Click **Send**

You should now see the text **Hello, World!** in the bottom box.

## Summary

This is Spring Boot the absolute basic authentication using spring boot.

If you were to type the URL in a web browser Spring Boot will pop up an authentication box to type in the username and password, but we're interested in REST APIs, so this is how we would authenticate.