package com.test.servicea.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 12:12
 */

//servicea 服务
@FeignClient(value = "servicea")
// 添加@FeignClient时启动报错
//@RestController
//@RequestMapping("/tt1")
public interface ServiceaRemoteService
{
    @RequestMapping("/kkkk/tttt2")
    String get();






}
