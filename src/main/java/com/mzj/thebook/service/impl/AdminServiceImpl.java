package com.mzj.thebook.service.impl;

import com.mzj.thebook.Result;
import com.mzj.thebook.dao.AdminMapper;
import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.UUID;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    private final AdminMapper adminMapper;

    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public Result<?> login(AdminUser adminUser) {
        ArrayList<AdminUser> user;
        try {
            user = adminMapper.login(adminUser);
            if (user.size() == 0) {
                return new Result<>().error();
            }
        } catch (Exception e) {
            return new Result<>().error();
        }
        return new Result<>().success(user.get(0).getUsername());

    }

    @Override
    public Result<?> addBook(Book book) {
        try {
            book.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            adminMapper.addBook(book);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }

        return new Result<>().success(null);
    }

    @Override
    public Result<?> deleteBook(String id) {
        try {
            adminMapper.deleteBook(id);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(null);
    }
}
