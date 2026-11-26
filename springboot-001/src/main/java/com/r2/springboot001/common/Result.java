package com.r2.springboot001.common;

public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(T data){
        Result<T> r = new Result<>();
        r.code = 200;
        r.msg = "success";
        r.data = data;
        return r;
    }
    public static <T> Result<T> fail(Integer code,String msg){
        Result<T> r = new Result<>();
        r.code = code;
        r.msg = msg;
        return r;
    }
    public Integer getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
    public T getData() {
        return data;
    }

}
