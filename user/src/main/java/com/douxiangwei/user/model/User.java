package com.douxiangwei.user.model;

import lombok.Data;

@Data
public class User {

    private int id;
    private String userName;
    private String email;
    private String phoneNumber;
    private String password;
}
