package com.sl.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.dubbo.common.URL;

public class DemoServiceImpl implements DemoService {
    public void sayHello(String name) {

        URL url = RpcContext.getContext().getUrl();
        System.out.println("Hello " + name + String.format("protocol is %s, address is %s", url.getProtocol(), url.getAddress()));
        //System.out.println("Hello " + name);
    }
}