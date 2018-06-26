package com.example.study.bootjpa.service.impl;

import com.example.study.bootjpa.dao.UserRepository;
import com.example.study.bootjpa.entity.User;
import com.example.study.bootjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
