package com.value;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.pack.service.CustomerService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pack.service"})
public class ComponentScanDemoApplication {
	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(ComponentScanDemoApplication.class, args);
	
	System.out.println(ctx.containsBean("ss"));
	
CustomerService ser=	ctx.getBean(CustomerService.class);

System.out.println(ser.get());
	}

}
