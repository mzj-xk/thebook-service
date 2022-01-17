package com.mzj.thebook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mzj.thebook.Result;
import com.mzj.thebook.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface CommonMapper extends BaseMapper<Book> {

    ArrayList<Book> findAllBook();

    ArrayList<Book> findBookByName(String query);

    Book findBookById(String id);
}