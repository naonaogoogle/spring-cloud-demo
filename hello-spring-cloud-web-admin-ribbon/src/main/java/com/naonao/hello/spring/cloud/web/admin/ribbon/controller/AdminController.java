package com.naonao.hello.spring.cloud.web.admin.ribbon.controller;

import com.naonao.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-08-10 14:31
 */
@RestController
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @GetMapping("hi")
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message);
    }


}
