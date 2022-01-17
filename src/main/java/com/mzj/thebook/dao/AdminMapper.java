package com.mzj.thebook.dao;

import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import java.util.ArrayList;

@Mapper
public interface AdminMapper {
    ArrayList<AdminUser> findAll();

    ArrayList<AdminUser> login(AdminUser adminUser);

    void addBook(Book book);

    void deleteBook(String id);
}
