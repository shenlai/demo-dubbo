package com.sl.dubbospi.spidemo;

import com.sl.dubbospi.spidemo.api.Car;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CarDemo {

    public static void main(String[] args) {
        ExtensionLoader<Car> extensionLoader =
                ExtensionLoader.getExtensionLoader(Car.class);
//
//
//        Car redCar = extensionLoader.getExtension("red");
//        redCar.getColor();


        //AOP  CarWrapper  、CarWrapper
        Car benz = extensionLoader.getExtension("benz");

        Map<String, String> map = new HashMap<String, String>();
        map.put("car", "black");
        URL url = new URL("", "", 1, map);

        benz.getColorForUrl(url);

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
