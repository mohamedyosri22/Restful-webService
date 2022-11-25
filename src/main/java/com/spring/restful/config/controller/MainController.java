package com.spring.restful.config.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restful.model.Student;

//http://localhost:8080/restful/


@RestController
@RequestMapping("/Main")
//http://localhost:8080/restful/Main
public class MainController {
	
	//http://localhost:8080/restful/Main/facebook
	@GetMapping("/facebook")
	public String getMain() {
		return "hello yosri !!";
	}
	
	//http://localhost:8080/restful/Main/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		Student student1 = new Student(1,"mohamed","01122310599");
		Student student2= new Student(2,"ahmed","01122310599");
		Student student3 = new Student(3,"ali","01122310599");
		Student student4 = new Student(4,"layla","01122310599");
		Student student5 = new Student(5,"lian","01122310599");
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		
		return students;
	}

}
