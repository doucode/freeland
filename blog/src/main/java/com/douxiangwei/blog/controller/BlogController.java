package com.douxiangwei.blog.controller;

import com.douxiangwei.blog.Service.BlogService;
import com.douxiangwei.blog.model.Blog;
import com.douxiangwei.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/home")
    public Result<List<Blog>> getBlogs(@RequestParam("currentPage") int page,
                                       @RequestParam("pageSize") int showCount){
        return Result.ok(blogService.getBlogs(page,showCount));
    }

    @GetMapping(value = "/{id}")
    public Result<Blog> getBlog(@PathVariable("id") int id){
        return Result.ok(blogService.getBlog(id));
    }
}
