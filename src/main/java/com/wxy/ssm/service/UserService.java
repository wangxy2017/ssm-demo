package com.wxy.ssm.service;

import com.wxy.ssm.dao.UserMapper;
import com.wxy.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wangxy
 * @Date 2019/6/14 16:26
 * @Description TODO
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUser(User user) {
        return userMapper.queryUser(user);
    }
}
