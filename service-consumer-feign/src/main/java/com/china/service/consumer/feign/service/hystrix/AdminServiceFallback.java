package com.china.service.consumer.feign.service.hystrix;

import com.china.service.consumer.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Author: china wu
 * @Description: 熔断类
 * @Date: 2020/6/6 16:51
 */
@Component
public class AdminServiceFallback implements AdminService {
    @Override
    public String sayHi() {
        return "请求失败，请检查网络！";
    }
}
