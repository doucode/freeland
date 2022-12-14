package com.douxiangwei.blog.controller;

import com.douxiangwei.blog.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("site")
public class SiteController {

    @GetMapping("")
    public Result<String> getIntro(){
        String intro = "dxw's website";
        return Result.ok(intro);
    }
}
