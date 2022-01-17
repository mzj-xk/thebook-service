package com.mzj.thebook.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mzj.thebook.Result;
import com.mzj.thebook.dao.CommonMapper;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.CommonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class CommonServiceImpl implements CommonService {
    private final CommonMapper commonMapper;

    public CommonServiceImpl(CommonMapper commonMapper) {
        this.commonMapper = commonMapper;
    }


    @Override
    public Result<?> findAllBook() {
        ArrayList<Book> books;
        try {
            books = commonMapper.findAllBook();
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(books);
    }

    @Override
    public Result<?> findBookByName(String query) {
        ArrayList<Book> books;
        try {
            books = commonMapper.findBookByName(query);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(books);
    }

    @Override
    public Result<?> findBookById(String id) {
        Book book = null;
        try {
            book = commonMapper.findBookById(id);
        } catch (Exception e) {
            System.out.println(e);
        }
        return new Result<>().success(book);
    }


}
