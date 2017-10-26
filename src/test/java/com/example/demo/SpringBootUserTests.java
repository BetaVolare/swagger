package com.example.demo;

import com.example.demo.dao.UserRepository;
import com.example.demo.entry.user;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SpringBootUserTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test1(){
        user u =userRepository.findByName("AA");
        System.out.print(u);
    }
    @Test
    public void test2(){
        user u1 =userRepository.findByName("AA");
        System.out.print("第一次："+u1);

        user u2 =userRepository.findByName("AA");
        System.out.print("第二次："+u2);
    }


}
