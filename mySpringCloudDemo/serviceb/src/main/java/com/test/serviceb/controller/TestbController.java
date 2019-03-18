package com.test.serviceb.controller;

import com.test.servicea.model.TestModel;
import com.test.servicea.service.ServiceaRemoteService;
import com.test.serviceb.model.TestbModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static javax.swing.UIManager.get;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 16:12
 */
@RestController
@RequestMapping("/rrrr")
public class TestbController
{


    @Value("${from}")  // 从对应的配置中心找到文件并把属性注入到value值中
    private String value;


    @Autowired
    private ServiceaRemoteService serviceaRemoteService;


    @RequestMapping("/hello")
    public String hello() {
        return "hello" + value;
    }


    @GetMapping("/cc")
    public String test2(){
        //直接调用servicea对外提供的服务
        return serviceaRemoteService.get();
    }




}
