package com.mzj.thebook.controller;

import com.mzj.thebook.Result;
import com.mzj.thebook.service.impl.CommonServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/common")
public class CommonController {
    private final CommonServiceImpl commonServiceImpl;


    public CommonController(CommonServiceImpl commonServiceImpl) {
        this.commonServiceImpl = commonServiceImpl;
    }


    @GetMapping("/findBookById/{id}")
    public Result<?> findBookById(@PathVariable String id) {
        return commonServiceImpl.findBookById(id);
    }

    @GetMapping("/findBookByName")
    public Result<?> findBookByName(@RequestParam String query, @RequestParam int pageNum, @RequestParam int pageSize) {
        return commonServiceImpl.findBookByName(query, pageNum, pageSize);
    }

    @GetMapping("/findAllBook")
    public Result<?> findAllBook(
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize) {
        return commonServiceImpl.findAllBook(pageNum, pageSize);
    }
}
