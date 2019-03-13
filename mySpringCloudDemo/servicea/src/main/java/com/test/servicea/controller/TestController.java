package com.test.servicea.controller;

import com.test.servicea.other.TestbService;
import com.test.servicea.service.TestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 16:12
 */
@RestController
@RequestMapping("/kkkk")
public class TestController
{

    @Autowired
    private TestaService testaService;


    @Autowired
    private TestbService testbService;


    @GetMapping("/tttt")
    public String test(){

        //调用servicea的服务
        return testaService.get();
    }


    @GetMapping("/tttt2")
    public String test2(){
        System.out.println("lllllllllllllllllllllll");
        //调用servicea的服务
        return testbService.get();
    }

}
