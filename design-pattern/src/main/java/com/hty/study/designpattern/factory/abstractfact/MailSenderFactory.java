package com.hty.study.designpattern.factory.abstractfact;

import com.hty.study.designpattern.factory.Sender;
import com.hty.study.designpattern.factory.SenderFactory;
import com.hty.study.designpattern.factory.impl.MailSender;

/**
 * Created by tongyang.hty on 2017/1/9.
 */
public class MailSenderFactory implements SenderFactory {
    @Override
    public Sender getSenderFactory() {
        return new MailSender();
    }
}
