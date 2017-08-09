package com.bohai.adviser.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    
    static Logger logger = Logger.getLogger(LoginController.class);
    
    @RequestMapping("login")
    public String login(){
        
        return "home";
    }
    
    public String 
}
