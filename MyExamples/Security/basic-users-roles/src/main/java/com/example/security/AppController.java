package com.example.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class AppController {

    @GetMapping("/hello")
    public String sayHello() {
        // get the role from basic auth authentication header
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String roles = "";
        roles = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(", "));

        // If we just want to get the first role, and remove the "ROLE_" prefix
        // String role = authentication.getAuthorities().stream()
        //                 .map(GrantedAuthority::getAuthority)
        //                 .findFirst()
        //                 .map(String::toUpperCase)
        //                 .filter(s -> s.startsWith("ROLE_"))
        //                 .map(s -> s.substring(5))
        //                 .orElse("ROLE_USER");

        return "Welcome. Your role is "+roles;

        // With roles you can then decide in your code what to do based on the role.
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}