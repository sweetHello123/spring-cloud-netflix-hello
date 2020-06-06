package com.china.service.consumer.feign.service;

import com.china.service.consumer.feign.service.hystrix.AdminServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: china wu
 * @Description:
 * @Date: 2020/6/6 16:16
 */
@FeignClient(value = "service-provider",fallback = AdminServiceFallback.class)
public interface AdminService {

    @GetMapping("/hi")
    String sayHi();
}
