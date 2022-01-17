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
    public Result<?> findBookByName(String query, int pageNum, int pageSize) {
        Page<Book> bookPage;
        try {
            LambdaQueryWrapper<Book> wrapper = Wrappers.<Book>lambdaQuery().like(Book::getName, query);
            bookPage = commonMapper.selectPage(new Page<>(pageNum, pageSize), wrapper);
        }catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(bookPage);

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

    @Override
    public Result<?> findAllBook(int pageNum, int pageSize) {
        Page<Book> bookPage;
        try {
            LambdaQueryWrapper<Book> wrapper = Wrappers.<Book>lambdaQuery();
            bookPage = commonMapper.selectPage(new Page<>(pageNum, pageSize), wrapper);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(bookPage);
    }



}
