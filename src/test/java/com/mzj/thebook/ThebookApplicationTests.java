package com.mzj.thebook;

import com.mzj.thebook.controller.UserController;
import com.mzj.thebook.dao.BookMapper;
import com.mzj.thebook.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ThebookApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    UserController userController;
    @Autowired
    BookMapper bookMapper;

    @Test
    void test() {

    }


}
