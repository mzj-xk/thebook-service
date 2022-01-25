package com.mzj.thebook.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mzj.thebook.IdUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("book_short_commentary")
public class BookShortCommentary {
    @TableId
    private String bookId;
    private String userId;
    private float score;
    private String content;
    private Date time;

    public BookShortCommentary(String userId, float score, String content) {
        this.bookId = IdUtil.getId();
        this.userId = userId;
        this.score = score;
        this.content = content;
        this.time = new Date();
    }
}
