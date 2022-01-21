package com.mzj.thebook.entity;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDetail {
    Book bookInfo;
    Page<BookShortCommentary> bookShortCommentary;
    Page<BookCommentary> bookCommentary;
}
