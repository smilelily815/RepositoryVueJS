package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
