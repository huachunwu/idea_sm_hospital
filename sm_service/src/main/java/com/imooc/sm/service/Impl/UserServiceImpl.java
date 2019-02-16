package com.imooc.sm.service.Impl;

import com.imooc.sm.dao.UserDao;
import com.imooc.sm.entity.User;
import com.imooc.sm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void addUser(User user) {
        user.setStatus("正常");
        userDao.insert(user);
    }

    @Override
    public void remove(Integer id) {
        userDao.delete(id);
    }

    @Override
    public void edit(User user) {
        userDao.update(user);
    }

    @Override
    public User get(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public List<User> getAll() {
        return userDao.selectAll();
    }
}
