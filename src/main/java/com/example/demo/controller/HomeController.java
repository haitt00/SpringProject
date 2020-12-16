package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.User;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HomeController {
    @GetMapping(value = "/user") @JsonView(User.MyView.class)
    public User getUser(){
        return new User("Hai", "haitrinhjun5");
    }

    @GetMapping(value = "/students") @JsonView(User.MyView.class)
    public ArrayList<Student> getStudents(){
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("A", "a@gmail.com", "1"));
        studentList.add(new Student("B", "b@gmail.com", "2"));
        studentList.add(new Student("C", "c@gmail.com", "3"));
        studentList.add(new Student("D", "d@gmail.com", "4"));
        studentList.add(new Student("E", "e@gmail.com", "5"));
        return studentList;
    }
}
