package com.test.serviceb.service;

import com.test.serviceb.model.TestbModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 12:12
 */
@FeignClient(value = "serviceb")
public interface TestbService
{
    @GetMapping("/tt2")
    String get();
}
