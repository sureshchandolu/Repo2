package com.mto.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mto.entity.Loan;
import com.mto.repository.LoanRepository;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	LoanRepository loanRepo;

	@Override
	public void run(String... args) throws Exception {
		/*
		Customer customer=new Customer();
		customer.setCustomerId(111);
		customer.setCustomerName("PAVAN");
		
		Loan personal=new Loan();
		personal.setLoanId("LN-P191");
		personal.setLoanType("PERSONAL");
		personal.setAmount(200000.0);
		
		Loan home=new Loan();
		home.setLoanId("LN-H287");
		home.setLoanType("HOME");
		home.setAmount(500000.0);
		
		Loan gold=new Loan();
		gold.setLoanId("LN-G265");
		gold.setLoanType("GOLD");
		gold.setAmount(300000.0);
		
		personal.setCustomer(customer);
		home.setCustomer(customer);
		gold.setCustomer(customer);
		
		loanRepo.save(personal);
		loanRepo.save(home);
		loanRepo.save(gold);
		*/
		
		//Loan loan=loanRepo.findById("LN-H287").get();
		
		loanRepo.deleteById("LN-H287");

	}

}
