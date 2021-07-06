package com.sab.noumanagerv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Welcome {

    @RequestMapping("/")
    @ResponseBody
    public String home() {

        return "HELLOOOO";
    }

}