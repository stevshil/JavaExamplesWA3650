package com.example.beandemo;
 
// Importing required classes
// Importing required classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
// Annotation
@Configuration
public class CollegeConfig {
 
    // Creating the Bean for Principal Class
    @Bean public Principal principalBean()
    {
        return new Principal();
    }
 
    @Bean public College collegeBean()
    {
        // Constructor Injection
        return new College(principalBean());
    }
}