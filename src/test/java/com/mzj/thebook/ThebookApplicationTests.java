package com.mzj.thebook;

import com.mzj.thebook.controller.UserController;
import com.mzj.thebook.dao.BookMapper;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.entity.BookShortCommentary;
import com.mzj.thebook.service.impl.BookServiceImpl;
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

    @Autowired
    BookServiceImpl bookService;

    @Test
    void test() {
//        Result<?> result = bookService.detail("1",1,10);
//        bookService.deleteShortCommentary("111");
    }


}
