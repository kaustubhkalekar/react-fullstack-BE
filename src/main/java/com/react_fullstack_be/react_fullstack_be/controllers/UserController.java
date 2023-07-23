package com.react_fullstack_be.react_fullstack_be.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react_fullstack_be.react_fullstack_be.models.User;
import com.react_fullstack_be.react_fullstack_be.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("allusers")
    public List<User> getAllUsers() {
        // return "fetched users!!";
        return userService.getAllUsers();
    }

    @PostMapping("adduser")
    public String addUser(User user) {
        return userService.addUser(user);
    }

}
