package com.restmongotempletapi.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restmongotempletapi.app.document.Course;
import com.restmongotempletapi.app.service.AdminService;

@RestController
@RequestMapping("admin")
public class AdminController {
	@Autowired
	AdminService adminService;
     @PostMapping(value="/addCourse")
	public ResponseEntity<?> addCourse(@RequestBody Course course) {

		if (adminService.addCourse(course) != null) {
			return new ResponseEntity<>("Sucessfully Added", HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("ERROR PLEASE TRY AGAIN", HttpStatus.BAD_REQUEST);
	}

}
