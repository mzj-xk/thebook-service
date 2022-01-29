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
@NoArgsConstructor
@TableName("book_short_commentary")
@AllArgsConstructor
public class BookShortCommentary {
    @TableId
    private String commentaryId;
    private String bookId;
    private String userId;
    private String username;
    private float score;
    private String content;
    private Date time;

    public BookShortCommentary(String bookId, String userId, String username,float score, String content) {
        this.bookId = bookId;
        this.userId = userId;
        this.username = username;
        this.score = score;
        this.content = content;
    }

}
