package com.hty.study.dubbo.rpc.designpattern.factory.impl;

import com.hty.study.dubbo.rpc.designpattern.factory.Sender;

/**
 * Created by hantongyang on 2017/1/9.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MailSender");
    }
}
