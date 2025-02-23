package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication()
public class SecurityApplication {

	private static final Logger logger = LoggerFactory.getLogger(SecurityApplication.class);

	public static void main(String[] args) {
		logger.debug("DEBUG: Starting SecurityApplication");
		SpringApplication.run(SecurityApplication.class, args);
	}

}
