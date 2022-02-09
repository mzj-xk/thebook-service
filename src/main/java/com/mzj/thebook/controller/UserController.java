package com.mzj.thebook.controller;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.User;
import com.mzj.thebook.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public Result<?> create(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/login/{email}/{password}")
    public Result<?> login(@PathVariable String email, @PathVariable String password){
        return userService.login(email, password);
    }
}
