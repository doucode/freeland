package com.douxiangwei.blog.controller;

import com.douxiangwei.blog.Service.BlogService;
import com.douxiangwei.blog.model.Blog;
import com.douxiangwei.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blog/home")
    public Result<List<Blog>> getBlogs(@RequestParam("currentPage") int page,
                                       @RequestParam("pageSize") int showCount){
        return Result.ok(blogService.getBlogs(page,showCount));
    }

    @GetMapping("/blog/{id}/false")
    public Result<Blog> getBlog(@PathVariable("id") int id){
        Blog blog = blogService.getBlog(id);
        if (blog == null) {
            return Result.fail();
        } else {
            return Result.ok(blog);
        }
    }

//    @PostMapping("/blog")
//    public Result<?> addBlog(@RequestBody ){
//        blogService.addBlog();
//        return Result.ok();
//    }

}
