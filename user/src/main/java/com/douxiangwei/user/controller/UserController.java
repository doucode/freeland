package com.douxiangwei.user.controller;

import com.douxiangwei.user.model.User;
import com.douxiangwei.user.service.UserService;
import com.douxiangwei.user.vo.LogForm;
import com.douxiangwei.user.vo.RegisterForm;
import com.douxiangwei.user.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public Result<?> userRegister(@Valid @RequestBody RegisterForm registerForm){
        if(userService.register(registerForm)){
            return Result.ok("","注册成功");
        };
        return Result.fail("","注册失败");
    }

    @PostMapping("/user/login")
    public Result<?> userLogin(@Valid @RequestBody LogForm logForm){
        if(userService.login(logForm)){
            return Result.ok("","登陆成功");
        }
        return Result.fail("","登陆失败");
    }

    @GetMapping("/user/logout")
    public void userLogout(){

    }

}
