package com.mzj.thebook.controller;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.AdminUser;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.impl.AdminServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminServiceImpl adminServiceImpl;

    public AdminController(AdminServiceImpl adminServiceImpl) {
        this.adminServiceImpl = adminServiceImpl;
    }

    @PostMapping("/login")
    public Result<?> login(@RequestBody AdminUser adminUser) {
        return adminServiceImpl.login(adminUser);
    }

    @PostMapping("/addBook")
    public Result<?> addBook(@RequestBody Book book) {
        return adminServiceImpl.addBook(book);
    }

    @GetMapping("/deleteBook/{id}")
    public Result<?> deleteBook(@PathVariable String id) {
        return adminServiceImpl.deleteBook(id);
    }


}
