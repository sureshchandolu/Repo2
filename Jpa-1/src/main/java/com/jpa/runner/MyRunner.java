package com.jpa.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.entity.Passenger;
import com.jpa.repository.PassengerRepository;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	PassengerRepository repository;

	@Override
	public void run(String... args) throws Exception {
		/*
		Passenger passenger1=new Passenger();
		passenger1.setPassengerId(111);
		passenger1.setFirstName("Dinesh");
		passenger1.setLastName("Reddy");
		passenger1.setEmail("dini@gmail.com");
		passenger1.setSeatNo(29);
		
		repository.save(passenger1);
		
		Passenger passenger2=new Passenger();
		passenger2.setPassengerId(222);
		passenger2.setFirstName("Ravi");
		passenger2.setLastName("Kant");
		passenger2.setEmail("ravikant@gmail.com");
		passenger2.setSeatNo(14);
		
		repository.save(passenger2);
		
		Passenger passenger3=new Passenger();
		passenger3.setPassengerId(333);
		passenger3.setFirstName("Chetan");
		passenger3.setLastName("Chauvan");
		passenger3.setEmail("chetan@yahoo.com");
		passenger3.setSeatNo(17);
		
		repository.save(passenger3);
		*/
		
		/*
		Optional<Passenger>  opt=repository.findById(111);
		Passenger  p = opt.get();
		System.out.println(p.getFirstName()+"   "+p.getLastName()+"  "+p.getEmail());
		*/
		/*
		List<Passenger>  passengerList = repository.findAll();
		passengerList.forEach(passenger -> {
			System.out.println(passenger.getFirstName()+", "+passenger.getEmail()+", "+passenger.getSeatNo());
		});
		*/
		
		//repository.deleteById(333);
		
		/*
		Passenger p = repository.findByEmail("dini@gmail.com");
		System.out.println(p.getFirstName()+"  "+p.getLastName()+"  "+p.getSeatNo());
		*/
		
		/*
		List<Passenger>  passengerList = repository.getPassengers("Ravi", "Kumar");
		passengerList.forEach(passenger -> {
			System.out.println(passenger.getFirstName()+", "+passenger.getLastName()+", "+passenger.getEmail()+", "+passenger.getSeatNo());
		});
		*/
		
		/*
		List<Passenger>  passengerList = repository.someMethod(10);
		passengerList.forEach(passenger -> {
			System.out.println(passenger.getFirstName()+", "+passenger.getEmail()+", "+passenger.getSeatNo());
		});
		*/
		
		List<Object[]> list=repository.loadPassengers();
		list.forEach(obj -> {
			System.out.println(obj[0]+" , "+obj[1]);
		});
		
	}

}
