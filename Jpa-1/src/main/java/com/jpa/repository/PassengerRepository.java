package com.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	
	Passenger  findByEmail(String email);
	
	@Query("select p from Passenger p where p.firstName=?1 or p.lastName=?2")
	List<Passenger>  getPassengers(String fname,String lname);
	
	List<Passenger>  someMethod(@Param("seatNo") Integer seatNo);
	
	@Query("select p.firstName,p.seatNo from Passenger p")
	List<Object[]>  loadPassengers();
	
}
