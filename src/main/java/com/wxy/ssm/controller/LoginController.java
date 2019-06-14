package com.wxy.ssm.controller;

import com.wxy.ssm.core.CommonRespose;
import com.wxy.ssm.entity.User;
import com.wxy.ssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author wangxy
 * @Date 2019/6/14 15:56
 * @Description TODO
 **/
@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonRespose login(HttpServletRequest request, User user) {
        User user1 = userService.queryUser(user);
        if (user1 != null) {
            request.getSession().setAttribute("loginUser", user1);
            logger.debug("登录成功:{}",user1.getNickName());
            return new CommonRespose(0,"登录成功",user1);
        }
        return new CommonRespose(-1,"用户名或密码错误") ;
    }
}
