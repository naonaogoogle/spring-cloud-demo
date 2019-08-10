package com.naonao.hello.spring.cloud.web.admin.feign.controller;

import com.naonao.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-08-10 19:04
 */
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message) ;
    }
}
