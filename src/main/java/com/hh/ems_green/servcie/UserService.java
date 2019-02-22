package com.hh.ems_green.servcie;

import com.hh.ems_green.entity.User;

public interface UserService {


    User selectByusername(String username);

    User selectById(Integer id);

    Boolean login(String username, String password);
}
