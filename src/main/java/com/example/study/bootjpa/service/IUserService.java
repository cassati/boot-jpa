package com.example.study.bootjpa.service;

import com.example.study.bootjpa.entity.User;

import java.util.List;

public interface IUserService {

    User save(User user);

    void delete(Long id);

    User updateRemark(Long id, String remark);

    List<User> findAll();

    User getOne(Long id);
}
