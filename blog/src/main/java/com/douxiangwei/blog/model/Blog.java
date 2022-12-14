package com.douxiangwei.blog.model;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private int id;
    private int userId;
    private int categoryId;
    private Category category;
    private String title;
    private String content;
    private Date publishedAt;
    private Date UpdatedAt;
    private String tags;
    private String userName;
}
