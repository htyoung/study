package com.hty.study.dubbo.rpc;

import com.hty.study.dubbo.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 */
public class DemoRpc {
    @Autowired
    DemoService demoService;

    public void sayHello() {
        System.out.println(demoService.sayHello("abc"));
    }
}
