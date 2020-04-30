package com.sl.spi.dubbospi.impl;

import com.sl.spi.dubbospi.api.Car;
import org.apache.dubbo.common.URL;


public class RedCar implements Car {

    public void getColor() {
        System.out.println("red");
    }

    @Override
    public void getColorForUrl(URL url) {

    }
}
