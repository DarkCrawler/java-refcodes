package com.tags.rest;

import com.tags.rest.spring.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestMain {
   public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
   }
}