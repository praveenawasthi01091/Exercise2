package com.stackroute.controller;

import com.stackroute.module.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController
{
    @RequestMapping(value = "/")
    public ModelAndView getUserName(HttpServletRequest httpServletRequest)
    {
        System.out.println("Inside method");
        User user1=  new User();
        user1.setName("Praveen");
        user1.setPassword("123");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user",user1);
        return modelAndView;
    }

}
