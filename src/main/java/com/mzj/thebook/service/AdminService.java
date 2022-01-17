package com.mzj.thebook.service;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.entity.Book;
import org.springframework.stereotype.Service;

public interface AdminService {
    Result<?> login(AdminUser adminUser);

    Result<?> addBook(Book book);

    Result<?> deleteBook(String id);
}
