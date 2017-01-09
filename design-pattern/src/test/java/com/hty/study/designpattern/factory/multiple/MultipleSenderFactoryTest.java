package com.hty.study.designpattern.factory.multiple;

import org.junit.Test;

/**
 * Created by tongyang.hty on 2017/1/9.
 */
public class MultipleSenderFactoryTest {
    @Test
    public void multipleSenderFactoryTest() {
        MultipleSenderFactory factory = new MultipleSenderFactory();
        factory.getMailSender().send();
        factory.getSmsSender().send();
    }
}
