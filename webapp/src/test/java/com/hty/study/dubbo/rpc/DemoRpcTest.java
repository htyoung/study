package com.hty.study.dubbo.rpc;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:spring-config.xml"})//加载spring配置文件
public class DemoRpcTest {

    @Autowired
    private DemoRpc demoRpc;

    @Test
    public void testSayHello() {
        demoRpc.sayHello();
    }
}
