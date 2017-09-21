package com.hty.study.dubbo.rpc;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class DemoRpcTest {

    @Autowired
    private DemoRpc demoRpc;

    @Test
    public void testSayHello() {
        demoRpc.sayHello();
    }
}
