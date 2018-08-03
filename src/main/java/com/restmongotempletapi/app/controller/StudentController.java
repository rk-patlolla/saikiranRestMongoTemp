package com.restmongotempletapi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restmongotempletapi.app.document.Network;
import com.restmongotempletapi.app.document.Student;
import com.restmongotempletapi.app.document.UserDeatils;
import com.restmongotempletapi.app.service.StudentService;
import com.restmongotempletapi.app.service.UserNetWork;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService studentService;
    @Autowired
	UserNetWork userService;
	@PostMapping(value = "/addST")
	public ResponseEntity<?> addStudent(@RequestBody Student student) {

		if (studentService.addStudent(student) != null) {
			return new ResponseEntity<>("Sucessfully Added", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("ERROR PLEASE TRY AGAIN", HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/getST")
	public List<Student> getStudents() {
		return studentService.getStudents();
	}

	@PostMapping(value = "/addU")
	public ResponseEntity<?> addUser(@RequestBody UserDeatils usDeatils) {

		if (studentService.addUser(usDeatils) != null) {
			return new ResponseEntity<>("Sucessfully Added", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("ERROR PLEASE TRY AGAIN", HttpStatus.BAD_REQUEST);
	}

	@PostMapping (value="/addNetwork")
	public ResponseEntity<?>  addNetwork(@RequestBody Network  network) {
		
		if (userService.addNetWork(network)!= null) {
			return new ResponseEntity<>("Sucessfully Added", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("ERROR PLEASE TRY AGAIN", HttpStatus.BAD_REQUEST);
	}
	@GetMapping("/getUser")
	public List<UserDeatils> getUser() {
		return studentService.getUser();
	}

}
