package com.hty.study.designpattern.factory.staticfact;

import com.hty.study.designpattern.factory.Sender;
import com.hty.study.designpattern.factory.impl.SmsSender;
import com.hty.study.designpattern.factory.impl.MailSender;

/**
 * Created by hantongyang on 2017/1/9.
 */
public class StaticSenderFactory {
    public static Sender getMailSender() {
        return new MailSender();
    }

    public static Sender getSmsSender() {
        return new SmsSender();
    }
}
