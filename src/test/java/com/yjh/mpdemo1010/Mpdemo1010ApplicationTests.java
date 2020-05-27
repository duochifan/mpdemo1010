package com.yjh.mpdemo1010;

import com.yjh.mpdemo1010.entity.User;
import com.yjh.mpdemo1010.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class Mpdemo1010ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    void addUser(){
        User user = new User();
        user.setUsername("lucy");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("北京");
        userMapper.insert(user);
    }

}
