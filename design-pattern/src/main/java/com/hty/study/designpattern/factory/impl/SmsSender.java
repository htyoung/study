package com.hty.study.designpattern.factory.impl;

import com.hty.study.designpattern.factory.Sender;

/**
 * Created by hantongyang on 2017/1/9.
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender");
    }
}
