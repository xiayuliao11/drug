package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToController {

    @RequestMapping("tovivw")
    public String tovivw(String name){
        return name;
    }
}
