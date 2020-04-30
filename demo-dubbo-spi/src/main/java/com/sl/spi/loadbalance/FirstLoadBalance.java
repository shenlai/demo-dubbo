package com.sl.spi.loadbalance;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.LoadBalance;

import java.util.List;

/**
 * dubbo spi扩展
 * 所有@SPI注解的类都可以扩展
 */
public class FirstLoadBalance implements LoadBalance {


    @Override
    public <T> Invoker<T> select(List<Invoker<T>> list, URL url, Invocation invocation) throws RpcException {
        System.out.println("启动第一个");
        //固定使用第一个
        return list.get(0);
    }

}
