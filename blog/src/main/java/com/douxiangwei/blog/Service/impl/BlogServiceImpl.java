package com.douxiangwei.blog.Service.impl;

import com.douxiangwei.blog.Service.BlogService;
import com.douxiangwei.blog.model.Blog;
import com.douxiangwei.blog.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class BlogServiceImpl implements BlogService {
    public Blog getBlog(int id){
        Blog blog = new Blog();
        blog.setId(id);
        blog.setUserId(100);

        Category category = new Category();
        category.setId(1);
        category.setName("java");
        category.setCreatedAt(new Date());
        category.setUpdatedAt(new Date());

        blog.setCategory(category);
        blog.setTitle("world cup semi-final");
        blog.setContent("argentina vs croatia");
        blog.setPublishedAt(new Date());
        blog.setUpdatedAt(new Date());
        blog.setTags("football");
        blog.setUserName("dxw");

        return blog;
    }

    public List<Blog> getBlogs(int page, int showCount){
        Blog blog1 = new Blog();
        blog1.setId(new Random().nextInt(1000));
        blog1.setUserId(100);

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("java");
        category1.setCreatedAt(new Date());
        category1.setUpdatedAt(new Date());

        blog1.setCategory(category1);
        blog1.setTitle("world cup semi-final");
        blog1.setContent("argentina vs croatia");
        blog1.setPublishedAt(new Date());
        blog1.setUpdatedAt(new Date());
        blog1.setTags("football");
        blog1.setUserName("dxw");

        Blog blog2 = new Blog();
        blog2.setId(new Random().nextInt(1000));
        blog2.setUserId(100);

        Category category2 = new Category();
        category2.setId(1);
        category2.setName("java");
        category2.setCreatedAt(new Date());
        category2.setUpdatedAt(new Date());

        blog2.setCategory(category2);
        blog2.setTitle("world cup semi-final");
        blog2.setContent("france vs morocco");
        blog2.setPublishedAt(new Date());
        blog2.setUpdatedAt(new Date());
        blog2.setTags("football");
        blog2.setUserName("dxw");

        List<Blog> blogs = new ArrayList<Blog>();
        blogs.add(blog1);
        blogs.add(blog2);

        return blogs;
    }
}
