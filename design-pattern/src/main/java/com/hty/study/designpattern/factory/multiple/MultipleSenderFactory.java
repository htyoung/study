package com.hty.study.designpattern.factory.multiple;

import com.hty.study.designpattern.factory.Sender;
import com.hty.study.designpattern.factory.impl.MailSender;
import com.hty.study.designpattern.factory.impl.SmsSender;

/**
 * Created by tongyang.hty on 2017/1/9.
 * 多个工厂方法模式
 */
public class MultipleSenderFactory {
    public Sender getMailSender() {
        return new MailSender();
    }

    public Sender getSmsSender() {
        return new SmsSender();
    }
}
