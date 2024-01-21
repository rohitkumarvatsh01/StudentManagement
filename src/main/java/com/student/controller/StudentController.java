package com.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	//Create a New Record in Table.
	@PostMapping("/students")
	public String createRecordStudent(@RequestBody Student student) {
		studentRepository.save(student);
		return "New Record is Created Sucessfully";
	}
	
	//Retrieve all the Records from Table
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllRecords(){
		List<Student>studentList=new ArrayList<>();
		studentRepository.findAll().forEach(studentList::add);
		return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
	}
	
	//Retrieve one records from Table by Id
	@GetMapping("/students/{studentroll}")
	public ResponseEntity<Student> getStudentById(@PathVariable long studentroll){
		java.util.Optional<Student> stu=studentRepository.findById(studentroll);
		if(stu.isPresent()) {
			return new ResponseEntity<Student>(stu.get(), HttpStatus.FOUND);
		}
		else {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Update the Records in the Table by Id
	@PutMapping("/students/{studentroll}")
	public String updateStudentById(@PathVariable long studentroll, @RequestBody Student student) {
		java.util.Optional<Student>stu=studentRepository.findById(studentroll);
		if(stu.isPresent()) {
			Student existStu=stu.get();
			existStu.setStudent_name(student.getStudent_name());
			existStu.setStudent_address(student.getStudent_address());
			studentRepository.save(existStu);
			return "Student Details StudentRoll "+studentroll+" Updated";
		}
		else {
			return "Student Details StudentRoll "+studentroll+" Not Found";
		}
	}
	
	//Delete one records from Table by Id
	@DeleteMapping("/students/{studentroll}")
	public String deleteStudentById(@PathVariable long studentroll, @RequestBody  Student student) {
		studentRepository.deleteById(studentroll);
		return "Record is deleted Successfull";
	}
	
	//Delete all records From Table
	@DeleteMapping("/students")
	public String deleteAllRecords() {
		studentRepository.deleteAll();
		return "All Record are deleted Successfull";
	}
}
