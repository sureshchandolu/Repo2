package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PmsRestApiApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(PmsRestApiApplication.class, args);
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/*").allowedOrigins("*");
	}
	
	@Bean
	public  Docket  docket( ) {
		ApiInfoBuilder apiInfoBuilder= new ApiInfoBuilder();
		apiInfoBuilder.title("Product REST API Documentation");
		apiInfoBuilder.description("Product Rest endpoint to perform CRUD operations");
		apiInfoBuilder.version("1.1");
		
		ApiInfo apiInfo = apiInfoBuilder.build();
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.pms.controller"))
				.paths(PathSelectors.any())
				.build()
				.useDefaultResponseMessages(false)
				.apiInfo(apiInfo);
				
	}
}
