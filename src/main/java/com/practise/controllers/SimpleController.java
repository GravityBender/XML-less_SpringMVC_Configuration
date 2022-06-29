package com.practise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/simple")
public class SimpleController {

    @RequestMapping(method = RequestMethod.GET)
    public String processGetRequest(Model model){
        String transactionType = "Simple GET Transaction";
        model.addAttribute("transactionType", transactionType);

        return "get_view";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processPostRequest(Model model){
        String transactionType = "Simple POST Transaction";
        model.addAttribute("transactionType", transactionType);

        return "post_view";
    }

}
