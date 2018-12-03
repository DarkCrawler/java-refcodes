package com.tags.rest.interceptors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class CommonLogInterceptor extends HandlerInterceptorAdapter {

   /*
   SAMPLE INTERCEPTOR FOR REST WEB SERVICES
    */

   @Override
   public boolean preHandle(HttpServletRequest request,
                            HttpServletResponse response, Object object) throws Exception {
      log.info("Intercepting request from ::: {}", request.getRequestURL());
      return true;
   }
}
