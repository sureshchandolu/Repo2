package com.value.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.value.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	List<Student> findByStudentFirstName( String firstName);
	
	
@Query("select s from Student s where s.branchName=:branch_Name and s.courseSelected= :course_Selected")
List<Student> findByBranchAndCourseSelected( @Param("branch_Name")String nameOfBranch,  @Param("course_Selected")String selctdCoursebyStud);

	
//	@Query("select s from Student s where s.branchName=?1 and s.courseSelected= ?2")
//	List<Student> findByBranchAndCourseSelected( @Param("branchName") String nameOfBranch,  @Param("courseSelected") String slctdCoursebyStu);

	
	
	
	
	
}
