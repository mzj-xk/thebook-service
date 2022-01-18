package com.mzj.thebook.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mzj.thebook.IdUtil;
import com.mzj.thebook.Result;
import com.mzj.thebook.dao.BookMapper;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Result<?> addBook(Book book) {
        try {
            book.setId(IdUtil.getId());
            bookMapper.insert(book);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success("添加书籍成功");
    }

    @Override
    public Result<?> deleteBook(String id) {
        try {
            bookMapper.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success("删除书籍成功");
    }

    @Override
    public Result<?> updateBook(Book book) {
        try {
            bookMapper.updateById(book);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success("更改书籍成功");
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

    @Override
    public Result<?> findBookById(String id) {
        Book book;
        try {
            book = bookMapper.selectById(id);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(book);
    }

    @Override
    public Result<?> findBookByName(String name, int pageNum, int pageSize) {
        Page<Book> bookPage = null;
        try {
            LambdaQueryWrapper<Book> wrapper = Wrappers.<Book>lambdaQuery().like(Book::getName, name);
            if (!name.isEmpty()) {
                bookPage = bookMapper.selectPage(new Page<>(pageNum, pageSize), wrapper);
            }
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(bookPage);
    }

    @Override
    public Result<?> search(String keywords) {
        ArrayList<Book> books;
        try {
            books = bookMapper.search(keywords);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(books);
    }


}
