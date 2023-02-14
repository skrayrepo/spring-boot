package com.boot.practice.controller;

import com.boot.practice.properties.MyBootProperties;
import com.boot.practice.properties.PropertiesReader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @Autowired
    private MyBootProperties myBootConfig;

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public ModelAndView login(@RequestParam(name="name") String uname, @RequestParam String age){
        //String name =  req.getParameter("uname");
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("uname",uname);
        modelView.setViewName("login");
        //req.setAttribute("uname",uname);
        System.out.println("User Name is >>>>>>>>>"+myBootConfig.toString());
        System.out.println("Age is >>>>>>>>>"+age);
        return modelView;
    }
    @RequestMapping(value = "/",method = {RequestMethod.GET})
    public ModelAndView welcome(@Value("${myboot.name}") String uname){
        //String name =  req.getParameter("uname");
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("uname",uname);
        modelView.setViewName("login");
        //req.setAttribute("uname",uname);
        System.out.println("User Name is >>>>>>>>>"+uname);
        //System.out.println("Age is >>>>>>>>>"+age);
        return modelView;
    }


    @RequestMapping(value="/login/properties",method = {RequestMethod.GET})
    public String getProperties() throws JsonProcessingException {
        ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
        PropertiesReader propertiesReader = new PropertiesReader(myBootConfig.getName(),
                myBootConfig.getAge(),myBootConfig.getAddress(),myBootConfig.getInfo(),myBootConfig.getCountry());
        String json = objectWriter.writeValueAsString(propertiesReader);
        System.out.println(json);
        return json;
    }
}
