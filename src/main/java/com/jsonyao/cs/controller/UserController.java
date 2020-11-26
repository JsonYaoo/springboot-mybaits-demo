package com.jsonyao.cs.controller;

import com.jsonyao.cs.entity.User;
import com.jsonyao.cs.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户测试表 前端控制器
 * </p>
 *
 * @author jsonYaoo
 * @since 2020-11-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUser")
    public User getUser(){
        return userService.getById(1000);
    }

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
