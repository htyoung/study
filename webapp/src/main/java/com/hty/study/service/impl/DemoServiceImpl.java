package com.hty.study.service.impl;

import com.hty.study.dubbo.api.DemoService;

public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "your name is " + name;
    }
}
