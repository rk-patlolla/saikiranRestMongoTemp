package com.restmongotempletapi.app.service;

import java.util.List;

import com.restmongotempletapi.app.document.Student;
import com.restmongotempletapi.app.document.UserDeatils;

public interface StudentService {
    Student addStudent(Student student);
    
    List<Student> getStudents();
    
    UserDeatils addUser(UserDeatils deatils);
    
    
    List<UserDeatils> getUser();
    
}
