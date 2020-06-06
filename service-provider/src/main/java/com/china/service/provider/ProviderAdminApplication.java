package com.china.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/6/6 15:36
 */
@EnableEurekaClient
@SpringBootApplication
public class ProviderAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderAdminApplication.class, args);
    }
}
