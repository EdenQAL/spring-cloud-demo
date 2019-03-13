package com.test.serviceb.service;

import com.test.serviceb.model.TestbModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

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
 *
 * 接口和model层从原项目模块中剥离出来
 *
 */
@Service("testbService")
public class TestbServiceImpl implements TestbService
{
    @Override
    public String get() {
        return "kkkkkkkkk";
    }

//    @Override
//    public void get(TestModel model)
//    {
//
//        System.out.println(model.getClass().getName());
//
//        System.out.println("feign test");
//
//    }
//
//
//    @Override
//    public String get(TestbModel model) {
//        return "kkkkkkkkkkkk";
//    }




}
