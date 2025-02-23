package com.example.security;

// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.stream.Collectors;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class AppController {

    private static final Logger logger = LoggerFactory.getLogger(AppController.class);

    private boolean isAllowed(Jwt principal, Iterable<String> roles) {
        if (principal == null) { return false; }
        if (roles == null) { return false; }
        String username = principal.getClaim("sub");
        String the_roles = principal.getClaim("authorities");
        for (String role : roles) {
            logger.info("getClaimAsStringList: "+the_roles.contains(role));
            if (the_roles.contains(role)) {
                logger.info("CHECK CREDS: "+checkCredentials(username, the_roles));
                return checkCredentials(username, role);
            }
        }
        return false;
    }

    private boolean checkCredentials(String username, String role) {
        try (BufferedReader br = new BufferedReader(new FileReader("credentials.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                logger.info("ROLE IN checkCREDS: "+role+" VALUES1: "+values[2]);
                if (values.length == 3 && values[0].equals(username) && values[2].contains(role)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @PostMapping("/hello")
    public String sayHello(@AuthenticationPrincipal Jwt principal) {
        logger.info("ISALLOWED: "+isAllowed(principal, List.of("ADMIN", "MANAGER", "USER")));
        if (!isAllowed(principal, List.of("ADMIN", "MANAGER", "USER"))) { 
            return "Not allowed"; 
        }

        // return ResponseEntity.ok("Welcome. Your role is "+roles);
        return "All is well";

        // With roles you can then decide in your code what to do based on the role.
    }

    @PostMapping("/health")
    public String health() {
        return "OK";
    }
}