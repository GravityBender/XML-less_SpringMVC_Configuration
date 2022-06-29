package com.practise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/testcontroller")
public class TestController {

    @RequestMapping(method = RequestMethod.GET)
    public String viewTransactions(){
        return "simple-list";
    }

}
