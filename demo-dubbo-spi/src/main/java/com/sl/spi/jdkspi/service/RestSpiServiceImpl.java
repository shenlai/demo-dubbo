package com.sl.spi.jdkspi.service;

public class RestSpiServiceImpl implements SpiService {

    @Override
    public void sayHello() {
        System.out.println("我是Rest服务实现");
    }
}
