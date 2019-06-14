package com.wxy.ssm.entity;

/**
 * @Author wangxy
 * @Date 2019/6/14 16:01
 * @Description TODO
 **/
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
