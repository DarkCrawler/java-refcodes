package com.tags.rest.spring;

/*import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2*/
public class SwaggerConfig {
  /* @Bean
   public Docket productApi() {
      return new Docket(DocumentationType.SWAGGER_2)
         //  .groupName("CrawlerAPI") //for cluster of dockets
         .apiInfo(apiInfo()) // give the basic information about the API
         .select()
         .apis(RequestHandlerSelectors.basePackage("com.tags.rest.controllers"))
         .paths(getPaths())
         .build();
   }

   private Predicate<String> getPaths() {
      return regex("/api/*");
   }

   private ApiInfo apiInfo() {
      return new ApiInfoBuilder().title("Crawler API Services")
         .description("Crawler API reference documents")
         .termsOfServiceUrl("http://stilltobuild.com")
         .contact("darkcrawler.in@gmail.com").license("Crawler License")
         .licenseUrl("darkcrawler.in@gmail.com").version("1.0").build();
   }*/
}



/*
public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}

	private Predicate<String> postPaths() {
		return or(regex("/api/posts.*"), regex("/api/javainuse.*"));
	}




	 .select()
         .apis(RequestHandlerSelectors.basePackage("com.tags.rest.controllers"))
         .paths(PathSelectors.regex("/api/*"))
         .build();
 */
