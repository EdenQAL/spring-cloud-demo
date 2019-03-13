package com.test.servicea.other;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "servicea", fallback = TestbServiceFallBack.class)
public interface TestbService {

    @RequestMapping("/method1")
    String get();

}
