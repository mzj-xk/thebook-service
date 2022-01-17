package com.mzj.thebook.controller;

import com.mzj.thebook.Result;
import com.mzj.thebook.service.impl.CommonServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class CommonController {
    private final CommonServiceImpl commonServiceImpl;


    public CommonController(CommonServiceImpl commonServiceImpl) {
        this.commonServiceImpl = commonServiceImpl;
    }

    @GetMapping("/findAllBook")
    public Result<?> findAllBook() {
        return commonServiceImpl.findAllBook();
    }

    @GetMapping("/findBookById/{id}")
    public Result<?> findBookById(@PathVariable String id) {
        return commonServiceImpl.findBookById(id);
    }

    @GetMapping("/findBookByName/{query}")
    public Result<?> findBookByName(@PathVariable String query) {
        return commonServiceImpl.findBookByName(query);
    }
}
