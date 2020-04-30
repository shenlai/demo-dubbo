package com.sl.comsumer;

import com.sl.provider.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerStater {

    public static void main(String[] args) throws IOException, InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:dubbo-consumer.xml"});

        context.start();

        System.out.println("......consumer  started ...");

        for (int i = 0; i < 100; i++) {
            DemoService demoSevice = (DemoService)context.getBean("demoService", DemoService.class);
            demoSevice.sayHello("dubbo");
            Thread.sleep(1000);
        }

        //按任意键退出
        System.in.read();

    }
}
