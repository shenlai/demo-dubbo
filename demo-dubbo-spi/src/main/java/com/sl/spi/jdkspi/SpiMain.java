package com.sl.spi.jdkspi;

import com.sl.spi.jdkspi.service.SpiService;

import java.io.IOException;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * JDK spi
 * 在ServiceLoader.load的时候，根据传入的接口类，遍历META-INF/services目录下的以该类命名的文件中的所有类，并实例化返回。
 */
public class SpiMain {
    public static void main(String[] args) throws IOException {
        //加载接口
        ServiceLoader<SpiService> spiLoader = ServiceLoader.load(SpiService.class);

        Iterator<SpiService> iteratorSpi = spiLoader.iterator();
        while (iteratorSpi.hasNext()) {
            SpiService spiService = iteratorSpi.next();
            spiService.sayHello();
        }
    }


}
