package com.otm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.otm.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, String> {

}
