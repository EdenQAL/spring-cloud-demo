package com.test.servicea.service;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 16:13
 */

/**
 *
 * 方法可以提供给本模块使用，也可以提供给其他模块使用
 * service-api 同时提供给服务提供方servicea 依赖也可以作为服务消费方serviceb
 * 、servicec 等等其他服务调用，不需要通过http调用
 *
 */
@Service
public class TestaServiceImpl implements TestaService
{

    @Override
    public String get()
    {
        System.out.println("feign test");
        return "feign test";
    }

}
