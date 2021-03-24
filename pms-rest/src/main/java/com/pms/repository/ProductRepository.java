package com.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product>  findByManufacturer(String manufacturer);

}
