package com.value.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.pack.service.CustomerService;

public class MyRunner implements CommandLineRunner {
	@Autowired
	CustomerService service1;

	@Override
	public void run(String... args) throws Exception {
		

	}

}
