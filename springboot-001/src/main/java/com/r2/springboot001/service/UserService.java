package com.r2.springboot001.service;

import com.r2.springboot001.common.Result;
import com.r2.springboot001.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public Result<String> register(String username, String password){
        if(userMapper.countByUsername(username)>0){
            return Result.fail(40001,"用户名已存在");
        }
        userMapper.insertUser(username,password);
        return Result.success("注册成功");
    }
}
