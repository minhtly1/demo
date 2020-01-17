package com.dyheart.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private final StudentDataAccessService studentDataAccessService; 
	
	@Autowired
	public StudentService(StudentDataAccessService studentDataAccessService) {
		this.studentDataAccessService = studentDataAccessService;
	}



	public List<Student> getAllStudents(){
		return studentDataAccessService.selectAllStudents();
				
	}
}
