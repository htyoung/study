package com.hty.study.dubbo.rpc.designpattern.factory.ordinary;

import com.hty.study.dubbo.rpc.designpattern.factory.Sender;
import com.hty.study.dubbo.rpc.designpattern.factory.impl.MailSender;
import com.hty.study.dubbo.rpc.designpattern.factory.impl.SmsSender;

/**
 * Created by hantongyang on 2017/1/9.
 */
public class OrdinarySenderFactory {
    public Sender getSender(String type) {
        if (type.equals("mail")) {
            return new MailSender();
        } else if (type.equals("sms")) {
            return new SmsSender();
        } else {
            return null;
        }
    }
}
