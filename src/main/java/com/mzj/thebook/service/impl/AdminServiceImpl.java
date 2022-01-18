package com.mzj.thebook.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.mzj.thebook.Result;
import com.mzj.thebook.dao.AdminMapper;
import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminMapper adminMapper;

    public AdminServiceImpl(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }


    @Override
    public Result<?> login(AdminUser adminUser) {
        AdminUser user;
        try {
            user = adminMapper.selectOne(Wrappers.<AdminUser>lambdaQuery().eq(AdminUser::getUsername, adminUser.getUsername()).eq(AdminUser::getPassword, adminUser.getPassword()));
        } catch (Exception e) {
            return new Result<>().error();
        }
        if (user != null) {
            return new Result<>().success(user.getUsername());
        } else {
            return new Result<>().error();
        }
    }
}
