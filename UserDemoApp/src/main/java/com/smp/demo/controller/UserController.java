package com.smp.demo.controller;

import com.smp.demo.repository.User;
import com.smp.demo.service.UserImpl;
import com.smp.demo.service.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //8021
    @Autowired
    UserInfo userInfo;

    @GetMapping(value = "/get_users")
    public List<User> getAllUsers() {
        return userInfo.getAllUsers();
    }

    @PostMapping(value = "/add_user")
    public User addUser(@RequestBody User user) {
        return userInfo.addUser(user);
    }
}
