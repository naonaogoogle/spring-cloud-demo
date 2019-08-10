package com.naonao.hello.spring.cloud.web.admin.feign.service;

import com.naonao.hello.spring.cloud.web.admin.feign.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-08-10 19:02
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping(value = "hi")
    String sayHi(@RequestParam String message);

}
