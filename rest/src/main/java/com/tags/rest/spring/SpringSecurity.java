package com.tags.rest.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

///////TO  BE REVISITED

//@Configuration
//@EnableWebSecurity
public class SpringSecurity  {
//public class SpringSecurity extends WebSecurityConfigurerAdapter {
/*
   @Override
   protected void configure(HttpSecurity http) throws Exception {
     /* http
         .csrf().disable()
         .exceptionHandling()
         .authenticationEntryPoint(restAuthenticationEntryPoint)
         .and()
         .authorizeRequests()
         .antMatchers("/API/foos").authenticated()
         .antMatchers("/API/admin/**").hasRole("ADMIN")
         .and()
         .formLogin()
         .successHandler(mySuccessHandler)
         .failureHandler(myFailureHandler)
         .and()
         .logout();
   }

   @Override
   protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
      /*http
         .authorizeRequests()
         .antMatchers("/", "/home").permitAll() //permit all URL with this pattern
         .anyRequest().authenticated()
         .and()
         .formLogin()
         .loginPage("/login")
         .permitAll()
         .and()
         .logout()
         .permitAll(); */
/*
      auth.inMemoryAuthentication()
         .withUser("admin").password("adminPass").roles("ADMIN")
         .and()
         .withUser("user").password("userPass").roles("USER");
   }

   @Bean
   @Override
   public UserDetailsService userDetailsService() {
      UserDetails user =
         User.withDefaultPasswordEncoder()
            .username("user")
            .password("password")
            .roles("USER")
            .build();

      return new InMemoryUserDetailsManager(user);
   }

   /* Sample code password encryption
   @Bean
public PasswordEncoder  encoder() {
    return new BCryptPassowordEncoder();
}

    */
}
