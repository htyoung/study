package com.hty.study.dubbo.rpc.designpattern.factory.abstractfact;

import com.hty.study.dubbo.rpc.designpattern.factory.Sender;
import com.hty.study.dubbo.rpc.designpattern.factory.SenderFactory;
import com.hty.study.dubbo.rpc.designpattern.factory.impl.SmsSender;

/**
 * Created by tongyang.hty on 2017/1/9.
 */
public class SmsSenderFactory implements SenderFactory {
    @Override
    public Sender getSenderFactory() {
        return new SmsSender();
    }
}
