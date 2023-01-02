package com.douxiangwei.blog.Service;

import com.douxiangwei.blog.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    Blog getBlog(int id);

    List<Blog> getBlogs(int page, int showCount);
}
