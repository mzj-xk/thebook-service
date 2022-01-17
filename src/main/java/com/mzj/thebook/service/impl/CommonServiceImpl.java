package com.mzj.thebook.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mzj.thebook.Result;
import com.mzj.thebook.dao.BookMapper;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.CommonService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommonServiceImpl implements CommonService {
    private final BookMapper bookMapper;

    public CommonServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }



    @Override
    public Result<?> findBookByName(String query, int pageNum, int pageSize) {
        Page<Book> bookPage;
        try {
            LambdaQueryWrapper<Book> wrapper = Wrappers.<Book>lambdaQuery().like(Book::getName, query);
            bookPage = bookMapper.selectPage(new Page<>(pageNum, pageSize), wrapper);
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
            book = bookMapper.selectById(id);
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
            bookPage = bookMapper.selectPage(new Page<>(pageNum, pageSize), wrapper);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(bookPage);
    }



}
