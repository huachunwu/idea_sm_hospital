package com.imooc.sm.service.Impl;

import com.imooc.sm.dao.SelfDao;
import com.imooc.sm.entity.User;
import com.imooc.sm.service.SelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("selfService")
public class SelfServiceImpl implements SelfService {
    @Autowired
    private SelfDao selfDao;
    @Override
    public User login(String account,String password) {
       User user= selfDao.selectByAccount(account);
       if (user==null){
            return null;
       }else if (user.getPassword().equals(password)){
            return user;
       }
        return null;
    }

    @Override
    public void changePassword(Integer id, String password) {
        selfDao.changePassword(id,password);
    }
}
