package com.r2.springboot001.controller;

import com.r2.springboot001.common.Result;
import com.r2.springboot001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/api/user")
    public Result<String> saveUser(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");
        return  userService.register(username,password);
    }

}
