package com.china.service.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/2/7 0:02
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String sayHi() {
        return "Hello Eureka, i am from port: " + port;
    }
}