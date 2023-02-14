package com.boot.practice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RefreshScope
public class LoginController {

    @RequestMapping(value = "login",method = {RequestMethod.GET})
    public ModelAndView login(@RequestParam(name="name") String uname, @RequestParam String age){
        //String name =  req.getParameter("uname");
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("uname",uname);
        modelView.setViewName("login");
        //req.setAttribute("uname",uname);
        System.out.println("User Name is >>>>>>>>>"+uname);
        System.out.println("Age is >>>>>>>>>"+age);
        return modelView;
    }
    @RequestMapping(value = "/",method = {RequestMethod.GET})
    public ModelAndView welcome(@Value("${myboot.person.name}") String uname){
        //String name =  req.getParameter("uname");
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("uname",uname);
        modelView.setViewName("login");
        //req.setAttribute("uname",uname);
        System.out.println("User Name is >>>>>>>>>"+uname);
        //System.out.println("Age is >>>>>>>>>"+age);
        return modelView;
    }

}
