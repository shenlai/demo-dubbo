package com.sl.spi.loadbalance;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.RpcException;
import org.apache.dubbo.rpc.cluster.LoadBalance;

import java.util.List;


/**
 * * dubbo spi扩展
 */
public class LastLoadBalance implements LoadBalance {

    /**
     * @param invokers   所有provider的实现
     * @param url
     * @param invocation
     * @param <T>
     * @return
     * @throws RpcException
     */
    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation)
            throws RpcException {
        System.out.println("启动最后一个");
        //固定使用最后一个
        return invokers.get(invokers.size() - 1);
    }
}
