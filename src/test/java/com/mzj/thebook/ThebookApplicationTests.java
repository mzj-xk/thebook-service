package com.mzj.thebook;

import com.mzj.thebook.controller.UserController;
import com.mzj.thebook.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ThebookApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    UserController userController;
    @Test
    void test() {
//        userController.createUser(new User("1","1","1","1",1));
    }




}
