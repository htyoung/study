package com.hty.study.dubbo.rpc.designpattern.factory.staticfact;

import org.junit.Test;

/**
 * Created by tongyang.hty on 2017/1/9.
 */
public class StaticSenderFactoryTest {
    @Test
    public void staticSenderFactoryTest() {
        StaticSenderFactory.getSmsSender().send();
        StaticSenderFactory.getMailSender().send();
    }
}
