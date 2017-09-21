package com.hty.study.dubbo.rpc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class DemoRpcTest {


    @Test
    public void testSayHello() {
        new DemoRpc().sayHello();
    }
}
