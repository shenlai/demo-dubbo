package com.sl.spi.jdkspi.service;

public class DubboSpiServiceImpl implements SpiService {

    @Override
    public void sayHello() {
        System.out.println("我是Dubbo服务实现");
    }
}
