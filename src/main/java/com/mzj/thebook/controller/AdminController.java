package com.mzj.thebook.controller;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.service.impl.AdminServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminServiceImpl adminService;

    public AdminController(AdminServiceImpl adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public Result<?> login(@RequestBody AdminUser adminUser) {
        return adminService.login(adminUser);
    }
}
