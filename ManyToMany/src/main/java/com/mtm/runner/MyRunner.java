package com.mtm.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mtm.entity.Customer;
import com.mtm.entity.Item;
import com.mtm.repository.CustomerRepository;
import com.mtm.repository.ItemRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	CustomerRepository custRepo;
	
	@Autowired
	ItemRepository  itemRepo;

	@Override
	public void run(String... args) throws Exception {
		Customer c1=new Customer();
		c1.setCustomerId(1); c1.setCustomerName("A");
		
		Customer c2=new Customer();
		c2.setCustomerId(2); c2.setCustomerName("B");
		
		Item i1=new Item();
		i1.setItemId(101);  i1.setItemName("Laptop");
		
		Item i2=new Item();
		i2.setItemId(102);  i2.setItemName("Mobile");
		
		Item i3=new Item();
		i3.setItemId(103);  i3.setItemName("Keyboard");
		
		List<Item> itemsList1 = new ArrayList<Item>();
		itemsList1.add(i1); itemsList1.add(i2); itemsList1.add(i3);
		
		c1.setItems(itemsList1);
	
		custRepo.save(c1);
		
		List<Customer> customersList=new ArrayList<Customer>();
		customersList.add(c1);
		customersList.add(c2);
		
		i1.setCustomers(customersList);
		
		
		itemRepo.save(i1);
	

	}

}
