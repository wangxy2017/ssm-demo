package com.wxy.ssm.core;

/**
 * @Author wangxy
 * @Date 2019/6/14 17:23
 * @Description TODO
 **/
public class CommonRespose {
    private Integer code;
    private String message;
    private Object data;

    public CommonRespose(Integer code,String message){
        this.code = code;
        this.message = message;
    }
    public CommonRespose(Integer code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
