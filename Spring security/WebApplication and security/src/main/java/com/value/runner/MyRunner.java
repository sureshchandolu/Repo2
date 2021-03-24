package com.value.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.value.entity.Student;
import com.value.repository.StudentRepository;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	StudentRepository repo;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {

//		Student student=new Student();
//		
//		student.setStudentFirstName("dummy");
//		student.setStudentLastName("dummy");
//		student.setBranchName("hyd_dil");
//		student.setCourseSelected("IBPS");
//		student.setStudentAddress("gnt");
//		student.setQualification("cse");
//		student.setFeePaid(18000L);

		// repo.save(student);

//		
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student");
//		EntityManager em=emf.createEntityManager();  
//		em.getTransaction().begin();  
//		
//		em.persist(student);

//	List<Student>list=	repo.findByBranchAndCourseSelected("hyd-k1", "CAT");
//	
//	list.forEach(student1->System.out.println(student1.getStudentFirstName()));
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String pwd1=encoder.encode("cvv");
		jdbcTemplate.update("insert into users values(?,?,?)" ,"cvv",pwd1,1);
		
		
		
		
		
		
		

	}

}
