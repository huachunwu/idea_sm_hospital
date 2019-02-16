package com.imooc.sm.service;

import com.imooc.sm.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void remove(Integer id);
    void edit(User user);
    User get(Integer id);
    List<User> getAll();
}
