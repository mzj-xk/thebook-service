package com.mzj.thebook.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mzj.thebook.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
