package com.revature.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.Model.Student;

@RestController

public class StudentController {
	
	@GetMapping("/student")
	public ResponseEntity<Student>getStudents() {
		Student s=new Student(1,"ERESHA");
		return ResponseEntity.ok().body(s);
	}
}
	
	
	
	
	

	
	
	