package com.naonao.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-08-10 19:00
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class WebAdminFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class,args);
    }

}
