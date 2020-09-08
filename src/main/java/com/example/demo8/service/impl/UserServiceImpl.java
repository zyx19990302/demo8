package com.example.demo8.service.impl;

import com.example.demo8.entity.User;
import com.example.demo8.mapper.UserMapper;
import com.example.demo8.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll(){
        return userMapper.allUser();
    }
}
