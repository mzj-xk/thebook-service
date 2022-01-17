package com.mzj.thebook;

import com.mzj.thebook.dao.BookMapper;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.impl.AdminServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ThebookApplicationTests {

    @Autowired
    BookMapper commonMapper;

    @Autowired
    AdminServiceImpl adminService;


    @Test
    void contextLoads() {
    }

    @Test
    void test() {
//        adminService.updateBook(new Book("1","change","change","change","change","change",1,1,"change",1));
    }




}
