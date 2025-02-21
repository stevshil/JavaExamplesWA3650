package com.example.security;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.Customizer;

@Configuration
@EnableWebSecurity
public class BasicConfig {
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
        // This is an example using a CSV file containing credentails, but you could change this for a database query
        List<UserDetails> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("credentials.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            String username = values[0];
            String password = passwordEncoder.encode(values[1]);
            String[] roles = values[2].split(";");
            users.add(User.withUsername(username).password(password).roles(roles).build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new InMemoryUserDetailsManager(users);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf(csrf->csrf.disable())
                .authorizeHttpRequests(authorize->authorize
                .requestMatchers("/api/health").permitAll()
                .anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .build();
    }
}