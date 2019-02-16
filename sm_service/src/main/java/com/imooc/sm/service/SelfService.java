package com.imooc.sm.service;

import com.imooc.sm.entity.User;

public interface SelfService {
    User login(String account,String password);
    void changePassword(Integer id,String password);
}
