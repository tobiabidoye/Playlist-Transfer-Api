package com.example.PlaylistMigrator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig{
   @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

    http.authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated())
        .oauth2Login(null);
    return http.build();
    
   } 
}
