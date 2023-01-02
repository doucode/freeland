package com.douxiangwei.user.service.impl;

import com.douxiangwei.user.model.User;
import com.douxiangwei.user.repository.UserRepository;
import com.douxiangwei.user.service.UserService;
import com.douxiangwei.user.vo.LogForm;
import com.douxiangwei.user.vo.RegisterForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean register(RegisterForm registerForm){
        if(userRepository.existsByPhoneNumber(registerForm.getPhoneNumber())) {
            return false;
        };

        User user = new User();
        user.setUserName(registerForm.getUserName());
        user.setPhoneNumber(registerForm.getPhoneNumber());
        user.setPassword(registerForm.getPassword());
        user.setEmail(registerForm.getEmail());

        userRepository.save(user);
        return true;
    }

    @Override
    public boolean login(LogForm logForm){
        if(!userRepository.existsByPhoneNumber(logForm.getPhoneNumber())){
            return false;
        }

        User user = userRepository.findByPhoneNumber(logForm.getPhoneNumber());
        if(!user.getPassword().equals(logForm.getPassword())){
            return false;
        }

        return true;
    }
}
