package com.smp.demo.service;

import com.smp.demo.repository.User;

import java.util.List;

public interface UserInfo {
    public List<User> getAllUsers();
    public User getUserById(String id);
    public User getUserByName(String name);
    public User getUserByEmail(String mailId);
    public User addUser(User user);
    public void deleteUserById(String id);
}
