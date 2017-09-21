package com.hty.study.dubbo.rpc;

import com.hty.study.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoRpc {

    @Autowired
    private DemoService demoService;

    public void sayHello() {
        System.out.println(demoService.sayHello("abc"));
    }
}
