package com.example.restfulwebservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class SecurityConfig {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth.jdbcAuthentication()
        auth.inMemoryAuthentication()
                .withUser("kane")
                .password("{noop}kane") // encoding 사용할 것
                .roles("USER");
    }



}
