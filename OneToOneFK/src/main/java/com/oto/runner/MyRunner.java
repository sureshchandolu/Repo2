package com.oto.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oto.entity.Passport;
import com.oto.entity.Person;
import com.oto.repository.PassportRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	PassportRepository  passportRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Person person=new Person();
		person.setPersonId(101121);
		person.setPersonName("A");
		
		Passport passport=new Passport();
	//	passport.setPassportNo(433876);
		passport.setExpDate(LocalDate.of(2023, 12, 31));
		
		passport.setPerson(person);
		
		passportRepo.save(passport);

	}

}
