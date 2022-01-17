package com.mzj.thebook.service;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.User;

public interface UserService {
    Result<?> createUser(User user);

    Result<?> deleteUser(String id);

    Result<?> updateUser(User book);

    Result<?> findAllUser(int pageNum, int pageSize);

    Result<?> findUserByEmail(String email);

    Result<?> findUserByName(String name, int pageNum, int pageSize);
}
