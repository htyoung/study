package com.hty.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tongyang.hty on 2017/1/18.
 */
@Controller
public class IndexController {
    private static final String INDEX = "index";

    @RequestMapping("index")
    public String index(Model model) {
        List<String> list =new ArrayList<String>();
        list.add("123");
        list.add("456");
        list.add("789");
        model.addAttribute("name", "abc");
        model.addAttribute("list",list);
        return INDEX;
    }
}
