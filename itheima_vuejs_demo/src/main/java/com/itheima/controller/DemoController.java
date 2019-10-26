package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("demo")
public class DemoController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("method")
    @ResponseBody
    public List<User> method() {
        return userService.queryUserList();
    }
}
