package com.otm.runner;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.otm.entity.Customer;
import com.otm.entity.Loan;
import com.otm.repository.CustomerRepository;
import com.otm.repository.LoanRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	CustomerRepository  custRepo;
	
	@Autowired
	LoanRepository  loanRepo;

	@Override
	@Transactional
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
		
		Set<Loan> loans=new HashSet<Loan>();
		loans.add(personal);
		loans.add(home);
		loans.add(gold);
		
		customer.setLoans(loans);
		
		custRepo.save(customer);
		*/
		
		/*
		Customer customer=custRepo.findById(111).get();
		*/
		
		// add a new loan to a customer
		/*
		Loan vehicle=new Loan();
		vehicle.setLoanId("LN-V367");
		vehicle.setLoanType("VEHICLE");
		vehicle.setAmount(50000.0);
		
		Customer  customer=custRepo.findById(111).get();
		Set<Loan> loans=customer.getLoans();
		loans.add(vehicle);
		*/
		
		//remove a loan from a customer
		
		/*
		Loan loan=loanRepo.findById("LN-H287").get();
		
		Customer customer=custRepo.findById(111).get();
		
		Set<Loan> loans = customer.getLoans();
		
		Iterator<Loan> iterator=loans.iterator();
		
		while(iterator.hasNext()) {
			Loan ln = iterator.next();
			if(ln.getLoanId().equals(loan.getLoanId())) {
				iterator.remove();
			}
		}
		*/
		
		custRepo.deleteById(111);
		
		

	}

}
