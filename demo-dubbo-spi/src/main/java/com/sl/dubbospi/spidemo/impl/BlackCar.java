package com.sl.dubbospi.spidemo.impl;

import com.sl.dubbospi.spidemo.api.Car;
import org.apache.dubbo.common.Extension;
import org.apache.dubbo.common.URL;

@Extension("bbb")
public class BlackCar implements Car {

    public void getColor() {
        System.out.println("black");
    }

    @Override
    public void getColorForUrl(URL url) {
        System.out.println("blackUrl");
    }
}
