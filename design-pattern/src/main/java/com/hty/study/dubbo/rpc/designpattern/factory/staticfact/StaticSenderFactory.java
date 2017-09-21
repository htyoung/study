package com.hty.study.dubbo.rpc.designpattern.factory.staticfact;

import com.hty.study.dubbo.rpc.designpattern.factory.Sender;
import com.hty.study.dubbo.rpc.designpattern.factory.impl.MailSender;
import com.hty.study.dubbo.rpc.designpattern.factory.impl.SmsSender;

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
