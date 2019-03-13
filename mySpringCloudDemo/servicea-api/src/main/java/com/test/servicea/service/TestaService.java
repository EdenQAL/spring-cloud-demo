package com.test.servicea.service;

import com.test.servicea.model.TestModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 12:12
 */
@FeignClient(value = "servicea")
// 添加@FeignClient时启动报错
@RestController
@RequestMapping("/tt1")
public interface TestaService
{
    @RequestMapping("/method1")
    String get();






}
