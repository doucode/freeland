package com.douxiangwei.user.service;

import com.douxiangwei.user.vo.LogForm;
import com.douxiangwei.user.vo.RegisterForm;

public interface UserService {
    boolean register(RegisterForm registerForm);

    boolean login(LogForm logForm);
}
