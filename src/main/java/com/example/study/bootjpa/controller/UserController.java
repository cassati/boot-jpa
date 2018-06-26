package com.example.study.bootjpa.controller;

import com.example.study.bootjpa.entity.User;
import com.example.study.bootjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public List<User> all(Model model) {
        List<User> users = userService.findAll();
        return users;
    }

}
