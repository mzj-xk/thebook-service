package com.mzj.thebook.service;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.Book;


public interface BookService {
    Result<?> addBook(Book book);

    Result<?> deleteBook(String id);

    Result<?> updateBook(Book book);

    Result<?> findAllBook(int pageNum, int pageSize);

    Result<?> findBookById(String id);

    Result<?> findBookByName(String name, int pageNum, int pageSize);

    Result<?> search(String keywords);

    Result<?> detail(String id, int pageNum, int pageSize);
}
