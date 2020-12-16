package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonView;

public class User {
    private String name;
    private String email;

    public interface MyView {};

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @JsonView(MyView.class)
    public String getName() {
        return name;
    }

    @JsonView(MyView.class)
    public String getEmail() {
        return email;
    }
}
