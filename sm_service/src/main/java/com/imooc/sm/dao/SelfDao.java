package com.imooc.sm.dao;

import com.imooc.sm.entity.User;
import org.springframework.stereotype.Repository;

@Repository("selfDao")
public interface SelfDao {
    User selectByAccount(String account);
    void changePassword(Integer id,String password);
}
