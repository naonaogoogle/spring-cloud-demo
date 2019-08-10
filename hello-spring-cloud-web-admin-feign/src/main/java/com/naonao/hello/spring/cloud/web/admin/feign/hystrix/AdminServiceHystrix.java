package com.naonao.hello.spring.cloud.web.admin.feign.hystrix;

import com.naonao.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-08-10 19:12
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return String.format("Hi, your message is : %s, but request error.", message);
    }
}
