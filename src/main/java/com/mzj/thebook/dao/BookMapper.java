package com.mzj.thebook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.entity.BookDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;


/// 管理员管理图书的mapper
@Mapper
public interface BookMapper extends BaseMapper<Book> {
    ArrayList<Book> search(String keywords);

    BookDetail detail(String id);
}
