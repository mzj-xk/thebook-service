package com.mzj.thebook.service;

import com.mzj.thebook.Result;


public interface CommonService {
    Result<?> findAllBook(int pageNum, int pageSize);

    Result<?> findBookByName(String query, int pageNum, int pageSize);

    Result<?> findBookById(String id);



}
