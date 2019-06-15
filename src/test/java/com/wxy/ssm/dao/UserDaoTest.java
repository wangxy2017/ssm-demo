package com.wxy.ssm.dao;

import com.wxy.ssm.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author wangxy
 * @Date 2019/6/14 16:41
 * @Description TODO
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring.xml","classpath:config/spring-mybatis.xml"})
public class UserDaoTest {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
    @Autowired
    private UserMapper userMapper;

    @Test
    public void queryUser() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        logger.debug("查询用户:{}",userMapper.queryUser(user));
    }
}
