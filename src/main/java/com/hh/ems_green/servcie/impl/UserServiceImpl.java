package com.hh.ems_green.servcie.impl;

import com.hh.ems_green.dao.UserMapper;
import com.hh.ems_green.entity.User;
import com.hh.ems_green.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByusername(String username) {
        return userMapper.selectByusername(username);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public Boolean login(String username, String password) {
        if (userMapper.selectByusername(username).getPassword().equals(password)) {
            return false;
        } else {

            return null;
        }
    }
}
