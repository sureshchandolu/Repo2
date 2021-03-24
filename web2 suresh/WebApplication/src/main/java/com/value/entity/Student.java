package com.value.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student {
	
@Id
@GenericGenerator(name="seq_id",strategy = "com.value.generator.SudentIdGenerator")
//@GeneratedValue(strategy = GenerationType.AUTO,generator = "seq_id")
@GeneratedValue(generator="seq_id")

	String studentId;
@Column(length=10)
	String studentFirstName;
@Column(length=10)
	String studentLastName;
@Column(length=6)
	String studentAddress;
@Column(length=7)
	String qualification;
@Column(length=5)
	String courseSelected;
@Column(length=7)
	String branchName;
	Long feePaid;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCourseSelected() {
		return courseSelected;
	}
	public void setCourseSelected(String courseSelected) {
		this.courseSelected = courseSelected;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public Long getFeePaid() {
		return feePaid;
	}
	public void setFeePaid(Long feePaid) {
		this.feePaid = feePaid;
	}
	
	
	

}
