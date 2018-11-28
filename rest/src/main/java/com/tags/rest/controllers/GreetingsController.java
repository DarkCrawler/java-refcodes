package com.tags.rest.controllers;

import com.tags.models.SimpleGreetingModel;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@Slf4j
public class GreetingsController {
   private static final String template = "Hello, %s!";
   private final AtomicLong counter = new AtomicLong();

   @RequestMapping("/greeting")
   public SimpleGreetingModel greeting(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "World") String name) {
      MDC.put("NAME", name);
      MDC.put("USERID", request.getHeader("UserId"));
      log.info("Called greetings rest webservice on ::: {}", DateTime.now());

      return SimpleGreetingModel.builder().id(counter.incrementAndGet())
         .content(String.format(template, name)).build();
   }
}
