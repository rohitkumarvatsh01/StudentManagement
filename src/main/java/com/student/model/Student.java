package com.student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studentroll")
	private Long studentroll;
	
	
	@Column(name="student_name")
	private String student_name;
	
	@Column(name="student_address")
	private String student_address;

	public long getstudentroll() {
		return studentroll;
	}

	public void setstudentroll(Long studentroll) {
		this.studentroll = studentroll;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	
	public Student() {
		
	}

	public Student(Long studentroll, String student_name, String student_address) {
		super();
		this.studentroll = studentroll;
		this.student_name = student_name;
		this.student_address = student_address;
	}

	@Override
	public String toString() {
		return "Student [studentroll=" + studentroll + ", student_name=" + student_name + ", student_address="
				+ student_address + "]";
	}
}
