// Dependency Injection version
// https://www.geeksforgeeks.org/spring-bean-annotation-with-example/

package com.example.beandemo;
 
// Importing required classes
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
// Application (Main) class
public class beananddemo {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Using AnnotationConfigApplicationContext
        // instead of ClassPathXmlApplicationContext
        // because we are not using XML Configuration
        ApplicationContext context
            = new AnnotationConfigApplicationContext(
                CollegeConfig.class);
 
        // Getting the bean
        College college
            = context.getBean("collegeBean", College.class);
 
        // Invoking the method
        // inside main() method
        college.test();
    }
}