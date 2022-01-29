package com.mzj.thebook.service;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.entity.BookCommentary;
import com.mzj.thebook.entity.BookShortCommentary;


public interface BookService {
    Result<?> addBook(Book book);

    Result<?> deleteBook(String id);

    Result<?> updateBook(Book book);

    Result<?> findAllBook(int pageNum, int pageSize);

    Result<?> findBookById(String id);

    Result<?> findBookByName(String name, int pageNum, int pageSize);

    Result<?> search(String keywords);

    Result<?> detail(String id, int pageNum, int pageSize);

    Result<?> addShortCommentary(BookShortCommentary bookShortCommentary);

    Result<?>deleteShortCommentary(String commentaryId);

    Result<?> addCommentary(BookCommentary bookCommentary);

    Result<?> deleteCommentary(String commentaryId);
}
