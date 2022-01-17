package com.mzj.thebook.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mzj.thebook.Result;
import com.mzj.thebook.dao.AdminUserMapper;
import com.mzj.thebook.dao.BookMapper;
import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    private final BookMapper adminBookMapper;
    private final AdminUserMapper adminUserMapper;

    public AdminServiceImpl(BookMapper adminBookMapper, AdminUserMapper adminUserMapper) {
        this.adminBookMapper = adminBookMapper;
        this.adminUserMapper = adminUserMapper;
    }

    @Override
    public Result<?> login(AdminUser adminUser) {
        AdminUser user;
        try {
            user = adminUserMapper.selectOne(Wrappers.<AdminUser>lambdaQuery().eq(AdminUser::getUsername, adminUser.getUsername()).eq(AdminUser::getPassword, adminUser.getPassword()));
        } catch (Exception e) {
            return new Result<>().error();
        }
        if (user == null) {
            return new Result<>().error();
        }

        return new Result<>().success(user.getUsername());


    }

    @Override
    public Result<?> addBook(Book book) {
        try {
            book.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            adminBookMapper.insert(book);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }

        return new Result<>().success(null);
    }

    @Override
    public Result<?> deleteBook(String id) {
        try {
            adminBookMapper.deleteById(id);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(null);
    }

    @Override
    public Result<?> updateBook(Book book) {
        try {
            adminBookMapper.updateById(book);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success(null);
    }

}
