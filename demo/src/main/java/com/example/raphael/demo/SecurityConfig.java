//package com.example.raphael.demo;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.headers().frameOptions().disable();
//        http.authorizeRequests()
//                .antMatchers("/authorization-code-test").access("#oauth2.hasScope('read')")
//                .anyRequest().authenticated();
//    }
//}
