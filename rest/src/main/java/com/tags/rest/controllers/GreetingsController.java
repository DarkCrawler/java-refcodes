package com.tags.rest.controllers;

import com.tags.rest.models.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {
   private static final String template = "Hello, %s!";
   private final AtomicLong counter = new AtomicLong();

   @RequestMapping("/greeting")
   public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
      return Greetings.builder().id(counter.incrementAndGet())
         .content(String.format(template, name)).build();
   }
}
