package com.example.spring_aspect.controller;

import com.example.spring_aspect.entity.User;
import com.example.spring_aspect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/select")
    public ModelAndView showList(User user){
        List<User> users = userService.selectList(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject(users);
        return  modelAndView;

    }

}
