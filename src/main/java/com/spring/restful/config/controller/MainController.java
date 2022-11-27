package com.spring.restful.config.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.exception.StudentException;
import com.spring.restful.model.Student;
import com.spring.restful.model.StudentError;

//http://localhost:8080/restful/

@RestController
@RequestMapping("/Main")
//http://localhost:8080/restful/Main
public class MainController {
	private List<Student> students = new ArrayList<Student>();

	@PostConstruct
	public void Start() {
		Student student1 = new Student(1, "mohamed", "01122310599");
		Student student2 = new Student(2, "ahmed", "01122310599");
		Student student3 = new Student(3, "ali", "01122310599");
		Student student4 = new Student(4, "layla", "01122310599");
		Student student5 = new Student(5, "lian", "01122310599");

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
	}

	// http://localhost:8080/restful/Main/facebook
	@GetMapping("/facebook")
	public String getMain() {
		return "hello yosri !!";
	}

	// http://localhost:8080/restful/Main/students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}

	// http://localhost:8080/restful/Main/get-student/1
	@GetMapping("/get-student/{id}")
	public Student getStudent(@PathVariable("id") int id) {
		if (id <= 0 && id > students.size()) {
			throw new StudentException("Student not found !");
		}
		return students.get(id - 1);
	}

	// http://localhost:8080/restful/Main/get-studentId?id=2
	@GetMapping("/get-studentId")
	public Student getStudentId(@RequestParam int id) {
		if (id <= 0 && id > students.size()) {
			throw new StudentException("Student not found !");
		}
		return students.get(id - 1);
	}

	@ExceptionHandler
	public ResponseEntity<StudentError> getException(StudentException se) {
		StudentError s = new StudentError();
		s.setStatusCode(HttpStatus.NOT_FOUND.value());
		s.setMessage(se.getMessage());
		s.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<StudentError>(s, HttpStatus.NOT_FOUND);
	}

}
