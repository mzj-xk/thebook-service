package com.mzj.thebook.service.impl;

import com.mzj.thebook.IdUtil;
import com.mzj.thebook.Result;
import com.mzj.thebook.dao.UserMapper;
import com.mzj.thebook.entity.User;
import com.mzj.thebook.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Result<?> createUser(User user) {
        try {
            user.setId(IdUtil.getId());
            userMapper.insert(user);
        } catch (Exception e) {
            System.out.println(e);
            return new Result<>().error();
        }
        return new Result<>().success("创建用户成功");
    }

    @Override
    public Result<?> deleteUser(String id) {
        return null;
    }

    @Override
    public Result<?> updateUser(User book) {
        return null;
    }

    @Override
    public Result<?> findAllUser(int pageNum, int pageSize) {
        return null;
    }

    @Override
    public Result<?> findUserByEmail(String email) {
        return null;
    }

    @Override
    public Result<?> findUserByName(String name, int pageNum, int pageSize) {
        return null;
    }
}
