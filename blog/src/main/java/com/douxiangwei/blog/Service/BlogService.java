package com.douxiangwei.blog.Service;

import com.douxiangwei.blog.model.Blog;

import java.util.List;

public interface BlogService {
    Blog getBlog(int id);

    List<Blog> getBlogs(int page, int showCount);
}
