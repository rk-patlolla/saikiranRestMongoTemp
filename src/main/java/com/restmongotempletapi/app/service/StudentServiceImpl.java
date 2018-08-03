package com.restmongotempletapi.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.restmongotempletapi.app.document.Student;
import com.restmongotempletapi.app.document.UserDeatils;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private MongoTemplate mongoTemplate;
	@Autowired
	private CounterImpl CounterService;

	@Override
	public Student addStudent(Student student) {
		mongoTemplate.save(student);
		return student;
	}

	@Override
	public List<Student> getStudents() {
		
		return mongoTemplate.findAll(Student.class);
	}

	@Override
	public UserDeatils addUser(UserDeatils deatils) {
		deatils.setUserId(CounterService.getNextUserIdSequence());
		mongoTemplate.save(deatils);
		return deatils;
	}

	@Override
	public List<UserDeatils> getUser() {
		
		return mongoTemplate.findAll(UserDeatils.class);
	}

	
		
}
