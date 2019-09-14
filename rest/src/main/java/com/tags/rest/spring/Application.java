package com.tags.rest.spring;

import com.tags.rest.interceptors.CommonLogInterceptor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

@Configuration
@ComponentScan(basePackages = "com.tags.rest")
//@EnableAutoConfiguration
public class Application extends WebMvcConfigurerAdapter {

   @Resource
   CommonLogInterceptor commonLogInterceptor;

   /********************************* INTERCEPTORS START*/

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(commonLogInterceptor);
   }

   /********************************* INTERCEPTORS END */
}
