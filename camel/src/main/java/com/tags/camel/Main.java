package com.tags.camel;

import com.tags.camel.spring.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}