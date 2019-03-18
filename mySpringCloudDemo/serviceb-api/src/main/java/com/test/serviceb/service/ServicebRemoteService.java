package com.test.serviceb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 12:12
 */

/**
 * FeignClient value 值对应服务提供方名称
 * Mapping路径对应上述服务的api 请求路径（在一个服务服务中每个处理方法api path是确定唯一的）
 */
@FeignClient(value = "serviceb")
public interface ServicebRemoteService
{
    @GetMapping("/tt2")
    String get();









}
