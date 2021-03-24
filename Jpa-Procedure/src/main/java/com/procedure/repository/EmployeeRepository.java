package com.procedure.repository;

import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.procedure.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	@Transactional
	@Procedure(name="readBonus")
	Map<String,Object>  calcBonus(Integer eno);

}
