package com.hty.study.designpattern.factory.ordinary;

import com.hty.study.designpattern.factory.Sender;
import org.junit.Test;

/**
 * Created by tongyang.hty on 2017/1/9.
 */
public class OrdinarySenderFactoryTest {
    @Test
    public void ordinarySenderFactoryTest() {
        OrdinarySenderFactory factory = new OrdinarySenderFactory();
        Sender mailSender = factory.getSender("mail");
        Sender smsSender = factory.getSender("sms");
        Sender other = factory.getSender("other");
        mailSender.send();
        smsSender.send();
        //other.send();
    }
}
