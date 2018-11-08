package com.tags.camel.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.tags.camel")
@Configuration
@Slf4j
public class Application implements CommandLineRunner {
   @Override
   public void run(String... args) throws Exception {
      log.info("Started application in command line..... call bean starts below...");
   }
}
