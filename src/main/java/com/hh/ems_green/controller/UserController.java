package com.hh.ems_green.controller;

import com.hh.ems_green.servcie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public Object login(String username, String password) {

        System.out.println("哈哈哈哈");

        HashMap<String, String> map = new HashMap<String, String>();
        Boolean b = userService.login(username, password);
        if (b) {
            map.put("msg", "1");
        } else {
            map.put("msg", "密码错误");
        }

        return map;
    }


}
