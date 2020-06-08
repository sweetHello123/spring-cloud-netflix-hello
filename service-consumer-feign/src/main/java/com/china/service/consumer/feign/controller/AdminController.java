package com.china.service.consumer.feign.controller;

import com.china.service.consumer.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/6/6 16:27
 */
@RefreshScope // 开启刷新动态配置
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
    public String sayHi(){
        return adminService.sayHi();
    }
}
