package com.mzj.thebook;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mzj.thebook.controller.AdminController;
import com.mzj.thebook.dao.AdminMapper;
import com.mzj.thebook.dao.CommonMapper;
import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class ThebookApplicationTests {

    @Autowired
    CommonMapper commonMapper;


    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        LambdaQueryWrapper<Book> wrapper = Wrappers.<Book>lambdaQuery();
        Page<Book> bookPage = commonMapper.selectPage(new Page<>(1, 10), wrapper);
        System.out.println(bookPage.getTotal());
    }




}
