package com.mzj.thebook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mzj.thebook.entity.Book;
import org.apache.ibatis.annotations.Mapper;


/// 管理员管理图书的mapper
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
