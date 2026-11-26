package com.r2.springboot001.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int insertUser(String username,String password){
        return jdbcTemplate.update("INSERT INTO users(username,password) VALUES (?,?)", username, password);
    }
    public int countByUsername(String username) {
        return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM users WHERE username = ?", Integer.class, username);
    }
}
