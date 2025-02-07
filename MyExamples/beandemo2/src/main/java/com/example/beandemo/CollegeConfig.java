package com.example.beandemo;
 
// Importing required classes
// Importing required classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
// Annotation
@Configuration
 
// Class
public class CollegeConfig {
 
    // Creating the Bean for Principal Class
    @Bean public Principal principalBean()
    {
 
        return new Principal();
    }
 
    @Bean public College collegeBean()
    {
 
        // Setter Injection
        College college = new College();
        college.setPrincipal(principalBean());
 
        return college;
    }
}