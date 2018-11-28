package com.tags.rconsumers.spring;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = "com.tags.rconsumers")
public class SpringConfig {

   @Bean
   public RestTemplate restTemplate(RestTemplateBuilder builder) {
      return builder.build();
   }
}
