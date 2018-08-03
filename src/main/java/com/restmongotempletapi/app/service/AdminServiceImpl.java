package com.restmongotempletapi.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.restmongotempletapi.app.document.Course;
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
	private MongoTemplate template;
	
	@Override public Course addCourse(Course course) {
		template.save(course);
	
		return course;
	}

}
