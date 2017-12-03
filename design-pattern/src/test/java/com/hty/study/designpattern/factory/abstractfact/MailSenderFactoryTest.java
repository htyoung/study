package com.hty.study.designpattern.factory.abstractfact;

import com.hty.study.designpattern.factory.SenderFactory;
import org.junit.Test;

/**
 * Created by tongyang.hty on 2017/1/9.
 */
public class MailSenderFactoryTest {
    @Test
    public void mailSenderFactoryTest() {
        SenderFactory factory = new MailSenderFactory();
        factory.getSenderFactory().send();
    }
}
