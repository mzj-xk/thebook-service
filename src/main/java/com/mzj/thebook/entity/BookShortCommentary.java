package com.mzj.thebook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookShortCommentary {
    private String bookId;
    private String userId;
    private float score;
    private String content;
    private Date time;
}
