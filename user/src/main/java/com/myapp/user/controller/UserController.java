package com.myapp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.user.entity.User;
import com.myapp.user.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public User getlUser() {
        User user = userService.getUser();
//        return "Hello";
        return user;
    }

    @GetMapping("/hey")
    public String sayHi() {
        return "Hi! How you doing?";
    }
}
