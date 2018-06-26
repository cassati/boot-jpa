package com.example.study.bootjpa.service;

import com.example.study.bootjpa.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();
}
