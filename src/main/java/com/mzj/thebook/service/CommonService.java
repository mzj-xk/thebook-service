package com.mzj.thebook.service;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


public interface CommonService {
    Result<?> findAllBook();

    Result<?> findBookByName(String query);

    Result<?> findBookById(String id);

}
