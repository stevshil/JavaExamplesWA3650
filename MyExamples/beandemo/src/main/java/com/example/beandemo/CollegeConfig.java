package com.example.beandemo;
 
// Importing required classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
// Annotation
@Configuration
 
// Class
public class CollegeConfig {
 
    // Creating College class Bean
    // using Bean annotation
    @Bean
 
    // Here the method name is the
    // bean id/bean name
    public College collegeBean()
    {
 
        // Returns the College class object
        return new College();
    }
}