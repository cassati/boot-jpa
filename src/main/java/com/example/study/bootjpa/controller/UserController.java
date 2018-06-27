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
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("all")
    @ResponseBody
    public List<User> all(Model model) {
        List<User> users = userService.findAll();
        return users;
    }

    @RequestMapping("/save")
    @ResponseBody
    public User save(Model model, User user) {
        user = userService.save(user);
        return user;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(Long id) {
        String msg = "id=" + id + "已删除";
        try {
            userService.delete(id);
        } catch (Exception e) {
            msg = e.getMessage();
        }
        return msg;
    }

    @RequestMapping("/update")
    @ResponseBody
    public User update(Model model, Long id, String remark) {
        User u = userService.updateRemark(id, remark);
        return u;
    }

}
