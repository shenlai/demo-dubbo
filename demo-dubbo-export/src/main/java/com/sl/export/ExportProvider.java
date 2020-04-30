package com.sl.export;


import com.sl.dubboapi.ProductService;
import com.sl.export.impl.ProductServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * 手动实现简易 Dubbo 导出服务
 */
public class ExportProvider {
    public static void main(String[] args) throws IOException {
        initDubbo();
    }

    public static void initDubbo() throws IOException {
        // 当前应用配置
        ApplicationConfig application = new ApplicationConfig();
        application.setName("demo-dubbo-export");

        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol("zookeeper");
        registry.setAddress("10.200.4.74:2181");

        // 服务提供者协议配置
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("rmi");
        protocol.setPort(21880);
        protocol.setThreads(100);

        // 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口
        // 服务提供者暴露服务配置
        // 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
        ServiceConfig<ProductService> service = new ServiceConfig<>();

        service.setApplication(application);
        service.setRegistry(registry); // 多个注册中心可以用setRegistries()
        service.setProtocol(protocol); // 多个协议可以用setProtocols()
        service.setInterface(ProductService.class);
        service.setRef(new ProductServiceImpl());

        // 暴露及注册服务
        service.export();

        System.in.read();

    }
}
