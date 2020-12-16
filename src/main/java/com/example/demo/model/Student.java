package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonView;

public class Student extends User{
    private String mssv;
    public Student(String name, String email, String mssv){
        super(name, email);
        this.mssv = mssv;
    }

    @JsonView(MyView.class)
    public String getMssv() {
        return mssv;
    }
}
