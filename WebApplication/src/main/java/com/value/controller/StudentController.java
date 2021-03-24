package com.value.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.value.entity.Student;
import com.value.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository repo;
	

	
	
	//@GetMapping(value="/all", produces=MediaType.APPLICATION_JSON_VALUE )
	@GetMapping("/all")
	public   List<Student>   getIndexPage() {
		
	return 	repo.findAll();
		
	
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Integer stdId) {
		
	return  repo.findById(stdId).get();
		
	
	}
	@GetMapping("/student/bc")
	public List<Student> getByBranchAndCourse(@RequestParam("branch") String branch,@RequestParam("course") String course) {
		return repo.findByBranchAndCourseSelected(branch, course);
		
		
		
	}
	
	
		
	}


