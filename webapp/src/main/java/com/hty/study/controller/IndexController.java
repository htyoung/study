package com.hty.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tongyang.hty on 2017/1/18.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    private static final String INDEX="index";
    @RequestMapping("index")
    public String index(){
        return INDEX;
    }
}
