package com.tags.rest.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Slf4j
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

   @Override
   public void configure(AuthenticationManagerBuilder auth) throws Exception {
      auth.inMemoryAuthentication()
         .withUser("tb").password("pwd1").authorities("ROLE_ADMIN").and()
         .withUser("demo").password("demo").authorities("ROLE_USER");
   }

   @Override
   public void configure(HttpSecurity httpSecurity) throws Exception {
      log.info("Hitting the spring security ....");
      httpSecurity
         .authorizeRequests()
         .antMatchers("**/api/admingreeting").access("hasRole('ROLE_ADMIN')")

         /* auth using filters */

         .anyRequest() //authorize all request
         .fullyAuthenticated() //fully authenticate
         .and().httpBasic(); //httpBasic authentication

      httpSecurity.csrf().disable(); //disable cross site scripting
   }
}

//.antMatchers("") to autorize certain patterns only
//.permitAll() //permit everything