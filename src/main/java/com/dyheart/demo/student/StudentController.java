package com.dyheart.demo.student;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyheart.demo.exception.ApiRequestException;

@RestController
@RequestMapping("students")
public class StudentController {
	
	private final StudentService studentService; 
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getAllStudents(){
//		throw new ApiRequestException("Oops Cannot get all students with custom exception");
		return studentService.getAllStudents();
	}
	
	@PostMapping
	public void addNewStudent(@RequestBody @Valid Student student) {
		studentService.addNewStudent(student);
	}
}
