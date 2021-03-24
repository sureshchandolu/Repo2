package com.value.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.value.entity.Student;
import com.value.repository.StudentRepository;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	StudentRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		
		
	/*	Student student=new Student();
		
		student.setStudentFirstName("sekhar");
		student.setStudentLastName("babu");
		student.setBranchName("hyd-k1");
		student.setCourseSelected("CAT");
		student.setStudentAddress("tenali");
		student.setQualification("EEE");
		student.setFeePaid(8000L);
		
		repo.save(student);  */
		
	List<Student>list=	repo.findByBranchAndCourseSelected("hyd-k1", "CAT");
	
	list.forEach(student->System.out.println(student.getStudentFirstName()));
		
		
		
		
		
		
	
	}

}
