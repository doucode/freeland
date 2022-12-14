package com.douxiangwei.blog.model;

import lombok.Data;

import java.util.Date;

@Data
public class Category {
    private int id;
    private String name;
    private Date createdAt;
    private Date updatedAt;
}
