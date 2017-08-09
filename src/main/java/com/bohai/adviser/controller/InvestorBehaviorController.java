package com.bohai.adviser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvestorBehaviorController {
    
    @RequestMapping("toInvestorBehavior")
    public String toInvestorBehavior(){
        
        return "investorBehavior";
    }

}
