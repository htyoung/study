package com.hty.study.dubbo.rpc.designpattern.factory.abstractfact;

import com.hty.study.dubbo.rpc.designpattern.factory.SenderFactory;
import org.junit.Test;

/**
 * Created by tongyang.hty on 2017/1/9.
 */
public class SmsSenderFactoryTest {
    @Test
    public void smsSenderFactoryTest() {
        SenderFactory factory = new SmsSenderFactory();
        factory.getSenderFactory().send();
    }
}
