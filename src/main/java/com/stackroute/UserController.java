package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController
{
    @RequestMapping(value = "/show")
    public ModelAndView getUserName(HttpServletRequest httpServletRequest)
    {
        String username=(httpServletRequest.getParameter("username"));
        String password=(httpServletRequest.getParameter("password"));
        User user1=  new User();
        user1.setName(username);
        user1.setPassword(password);
        ModelAndView modelAndView = new ModelAndView("display.jsp");
        modelAndView.addObject("user",user1);
        return modelAndView;
    }

}
