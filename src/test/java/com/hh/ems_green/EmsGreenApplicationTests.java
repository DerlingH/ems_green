package com.hh.ems_green;

import com.hh.ems_green.entity.User;
import com.hh.ems_green.servcie.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmsGreenApplicationTests {
    @Autowired
    private UserService usi;

    @Test
    public void contextLoads() {
        User user = usi.selectByusername("hh");
        System.out.println(user);
    }

    @Test
    public void test2() {
        User user = usi.selectById(1);
        System.out.println(user);
    }

    @Test
    public void test3() {

        System.out.println("33");
    }
}
