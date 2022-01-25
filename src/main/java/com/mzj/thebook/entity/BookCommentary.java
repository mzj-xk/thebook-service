package com.mzj.thebook.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookCommentary {
    @TableId
    private String bookId;
    private String userId;
    private float score;
    private String content;
    private Date time;

    public BookCommentary(String bookId, String userId, float score, String content) {
        this.bookId = bookId;
        this.userId = userId;
        this.score = score;
        this.content = content;
    }
}
