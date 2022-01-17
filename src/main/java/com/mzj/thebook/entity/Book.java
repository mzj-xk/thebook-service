package com.mzj.thebook.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("book_info")
public class Book {
    private String id;
    private String name;
    private String cover;
    private String author;
    private String press;
    private String producer;
    private float price;
    private int pagesNumber;
    private String isbn;
    private float score;

    public Book(String name, String cover, String author, String press, String producer, float price, int pagesNumber, String isbn, float score) {
        this.name = name;
        this.cover = cover;
        this.author = author;
        this.press = press;
        this.producer = producer;
        this.price = price;
        this.pagesNumber = pagesNumber;
        this.isbn = isbn;
        this.score = score;
    }

}
