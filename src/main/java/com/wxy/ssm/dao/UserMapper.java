package com.wxy.ssm.dao;

import com.wxy.ssm.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @Author wangxy
 * @Date 2019/6/14 16:21
 * @Description TODO
 **/
@Repository
public interface UserMapper {
    User queryUser(User user);
}
