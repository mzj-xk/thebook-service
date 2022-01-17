package com.mzj.thebook.controller;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.User;
import com.mzj.thebook.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/create")

    public Result<?> createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
