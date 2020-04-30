package com.sl.export.impl;

import com.sl.dubboapi.ProductService;

/**
 * @Author: sl
 * @Date: 2020/4/30
 * @Description: TODO
 */
public class ProductServiceImpl implements ProductService {

    public String getProductInfo(String id) {
        return "product id is " + id;
    }
}
