package com.dyheart.demo.student;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {
	
	@GetMapping
	public List<Student> getAllStudents(){
		return List.of(
				new Student(UUID.randomUUID(), "James", "Bond", "JamesBond@gmail.com", Student.Gender.MALE),
				new Student(UUID.randomUUID(), "Jenny", "Faith", "JFaith@gmail.com", Student.Gender.FEMALE)
				);
				
	}
}
