package com.douxiangwei.blog.Service.impl;

import com.douxiangwei.blog.Service.BlogService;
import com.douxiangwei.blog.model.Blog;
import com.douxiangwei.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public Blog getBlog(int id){
        Optional<Blog> blog = blogRepository.findById(id);
        if (blog.isPresent()) {
            return blog.get();
        } else {
            return null;
        }
    }

    public List<Blog> getBlogs(int page, int showCount){
        List<Blog> blogs = (List<Blog>) blogRepository.findAll();
        //List<Blog> blogs = (List<Blog>) blogRepository.findAllById();

        return blogs;
    }
}
