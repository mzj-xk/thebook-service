package com.mzj.thebook.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@TableName("user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId
    private String id;
    private String name;
    private String sex;
    private String password;
    private String email;
    private int block;

    public User(String name, String sex, String password, String email, int block) {
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.email = email;
        this.block = block;
    }
}
