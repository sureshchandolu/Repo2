package com.micro.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.customer.model.CustomerDto;
import com.micro.customer.model.LoginDTO;
import com.micro.customer.model.PlanDTO;
import com.micro.customer.model.RegisterDTO;
import com.micro.customer.service.ICustomerService;

@RestController
public class CustomerRestController {
	private  static String  PLAN_URL="http://localhost:7272/PlanDetails/{planId}";
	private  static String  FRIEND_URL="http://localhost:7373/FriendDetails/{phoneNumber}";

	@Autowired 
	private  ICustomerService   service;
	
	@Autowired
	RestTemplate  restTemplate;
	
	
	@PostMapping("/register")
	public boolean  addCustomer(@RequestBody RegisterDTO  registerDto) {
		return service.registerCustomer(registerDto);
	}
	
	@PostMapping("/login")
	public  boolean  loginCustomer(@RequestBody  LoginDTO loginDto) {
		return  service.loginCustomer(loginDto);
	}
	
	@GetMapping("/viewProfile/{phoneNumber}")
	public  CustomerDto  customerProfile(@PathVariable Long phoneNumber) {
		CustomerDto  customerDto=service.readCustomer(phoneNumber);
		
		//calling  friend-microservice
		
		ParameterizedTypeReference<List<Long>>   typeRef=new  ParameterizedTypeReference<List<Long>>() {};
		ResponseEntity<List<Long>> re = restTemplate.exchange(FRIEND_URL, HttpMethod.GET, null, typeRef, phoneNumber);
		List<Long> friendsContactList = re.getBody();
		
		customerDto.setFriendsContactNumbers(friendsContactList);
		
		//calling  plan-microservice
		PlanDTO  planDto = restTemplate.getForObject(PLAN_URL, PlanDTO.class, customerDto.getPlanId());
		customerDto.setCurrentPlan(planDto);
		
		return customerDto;
		
	}
}
