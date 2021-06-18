package com.cau.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    @RequestMapping(value = "/say2")
    public @ResponseBody String say(){
        return "吴彦祖真帅";
    }
}
