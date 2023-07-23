package com.react_fullstack_be.react_fullstack_be.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react_fullstack_be.react_fullstack_be.dao.UserDAO;
import com.react_fullstack_be.react_fullstack_be.models.User;

@Service
public class UserService {

    @Autowired
    UserDAO userDao;

    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    public String addUser(User user) {
        userDao.save(user);
        return "success";
    }

}
