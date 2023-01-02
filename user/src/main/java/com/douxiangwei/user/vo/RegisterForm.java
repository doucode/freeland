package com.douxiangwei.user.vo;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class RegisterForm {
    private String userName;
    private String phoneNumber;
    private String password;
    private String email;
}
