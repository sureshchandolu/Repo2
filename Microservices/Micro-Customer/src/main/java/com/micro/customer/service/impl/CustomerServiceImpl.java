package com.micro.customer.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.customer.entity.Customer;
import com.micro.customer.model.CustomerDto;
import com.micro.customer.model.LoginDTO;
import com.micro.customer.model.RegisterDTO;
import com.micro.customer.repository.CustomerRepository;
import com.micro.customer.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	CustomerRepository repository;

	@Override
	public boolean registerCustomer(RegisterDTO registerDto) {
		if(repository.existsById(registerDto.getPhoneNumber())==false) {
			Customer  customer=new Customer();
			BeanUtils.copyProperties(registerDto, customer);
			repository.save(customer);
			return true;
		}
		else {
			return  false;
		}
	}

	@Override
	public boolean loginCustomer(LoginDTO loginDto) {
		if(repository.checkLogin(loginDto.getPhoneNumber(), loginDto.getPassword())==1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public CustomerDto readCustomer(Long phoneNumber) {
		Customer customer = repository.findById(phoneNumber).get();
		CustomerDto  customerDto=new CustomerDto();
		BeanUtils.copyProperties(customer, customerDto);
		return customerDto;
	}

}
