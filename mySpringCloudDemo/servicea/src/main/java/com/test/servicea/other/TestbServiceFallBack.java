package com.test.servicea.other;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @auther: qiailei
 * @date: 2019-03-13 23:10
 */
@Component
public class TestbServiceFallBack implements TestbService {

    @Override
    public String get(){
        return "error";
    }

}
