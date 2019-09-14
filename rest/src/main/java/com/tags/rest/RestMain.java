package com.tags.rest;

import com.tags.rest.spring.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class RestMain {
   public static void main(String[] args) {
      // SpringApplication.run(Application.class, args);
      String tim1 = null;
      String tim2 = "123";
      System.out.println(tim1.equals("123"));
   }
}