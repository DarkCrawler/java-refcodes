package com.tags.rconsumers;

import com.tags.models.SimpleGreetingModel;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerMain {
   public static void main(String[] args) {
      RestTemplate restTemplate = new RestTemplate();
      SimpleGreetingModel model = restTemplate.getForObject("http://localhost:8070/greeting?name=Tim", SimpleGreetingModel.class);
      System.out.println("=====>" + model.toString());
   }
}
