package com.china.service.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/6/6 16:08
 */
@EnableHystrix
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.china.service")
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
