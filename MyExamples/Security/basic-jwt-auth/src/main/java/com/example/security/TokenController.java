package com.example.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.springframework.beans.factory.annotation.Value;
import java.util.stream.Collectors;
import io.jsonwebtoken.Jwts;

@RestController
@RequestMapping()
public class TokenController {

    @Value("${rsa.private-key}") RSAPrivateKey privateKey;
    @Value("${rsa.public-key}") RSAPublicKey publicKey;

    @PostMapping("/login")
    public String getToken() {
        // create jwt token
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String authorities = authentication.getAuthorities().stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.joining(","));

        String token = Jwts.builder()
            .setSubject(authentication.getName())
            .claim("authorities", authorities)
            .signWith(privateKey)
            .compact();

        return token;
    }

}