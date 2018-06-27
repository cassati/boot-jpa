package com.example.study.bootjpa.service.impl;

import com.example.study.bootjpa.dao.UserRepository;
import com.example.study.bootjpa.entity.User;
import com.example.study.bootjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(id);
    }

    @Override
    public User updateRemark(Long id, String remark) {
        if (id == null || remark == null) {
            throw new RuntimeException("更新参数不正确");
        }
        userRepository.updateRemark(id, remark);
        User u = userRepository.findOne(id);
        return u;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public User getOne(Long id) {
        return userRepository.getOne(id);
    }
}
