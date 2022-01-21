package com.mzj.thebook.controller;

import com.mzj.thebook.Result;
import com.mzj.thebook.entity.Book;
import com.mzj.thebook.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/add")
    public Result<?> addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/delete/{id}")
    public Result<?> deleteBook(@PathVariable String id) {
        return bookService.deleteBook(id);
    }

    @PostMapping("/update")
    public Result<?> updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @GetMapping("/findAll")
    public Result<?> findAllBook(@RequestParam(defaultValue = "1") int pageNum,
                                 @RequestParam(defaultValue = "10") int pageSize) {
        return bookService.findAllBook(pageNum, pageSize);
    }

    @GetMapping("/findById/{id}")
    public Result<?> findBookById(@PathVariable String id) {
        return bookService.findBookById(id);
    }

    @GetMapping("/findByName")
    public Result<?> findBookByName(
            @RequestParam(defaultValue = "") String name,
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize) {
        return bookService.findBookByName(name, pageNum, pageSize);
    }

    @GetMapping("/search/{keywords}")
    public Result<?> search(@PathVariable String keywords) {
        return bookService.search(keywords);
    }

    @GetMapping("/detail")
    public Result<?> detail(@RequestParam(defaultValue = "") String bookId,
                            @RequestParam(defaultValue = "1") int pageNum,
                            @RequestParam(defaultValue = "10") int pageSize) {
        return bookService.detail(bookId, pageNum, pageSize);
    }

}
