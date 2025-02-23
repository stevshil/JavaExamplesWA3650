# Simple use of Spring Boot Basic security - Users

This is the resource side of the **basic-jwt-auth** system.  You will need to have obtained a valid JWT for one of the below user acconts before you can use this application.

The users steve and admin will be allowed to view the resource **/api/hello** and will receive the message **All is well** if a valid JWT has been supplied.

This time the user information are read from a csv file called **credentials.csv**.  In the BasicConfig.java you will see how the file is loaded into the in memory user manager to determine if the user is valid.  You can change the FileReader for a database query instead to load the user details in.

This example also has a test, that passes the authentication header for basic auth and checks the return value.

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
localhost:8080/api/hello
```

In the **Auth** tab set the **Type** to **Bearer Token**.  Copy your JWT string from the **basic-jwt-auth** application into the **Token** text box.


Press **Send**

You should receive a **200 OK** in the bottom window and the message **All is well**.

If you used the **noone** user account then you will recieve **Not allowed**.