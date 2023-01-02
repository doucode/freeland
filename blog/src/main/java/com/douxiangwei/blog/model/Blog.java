package com.douxiangwei.blog.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter @Setter @ToString
@Entity
@Table(name="blogs")
public class Blog {
    @Id
    @Column(name = "blog_id", nullable = false)
    private int blogId;

    @Column(name = "category_id", nullable = false)
    private int categoryId;

    @Column(name = "blog_title", nullable = false)
    private String title;

    @Column(name = "blog_content", nullable = false)
    private String content;

    @Column(name = "published_at", nullable = false)
    private String publishedAt;

    @Column(name = "updated_at", nullable = false)
    private String UpdatedAt;

    @Column(name = "tags", nullable = false)
    private String tags;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "user_name", nullable = false)
    private String userName;
}
