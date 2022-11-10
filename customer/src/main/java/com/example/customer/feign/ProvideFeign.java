package com.example.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author liujiabin
 * @Date 2022/8/29 16:14
 */
@FeignClient(name = "provide")
public interface ProvideFeign {

    @GetMapping("/payment/nacos/{id}")
    String getPayment(@PathVariable("id") Integer id);

    @GetMapping("/errorPayment/nacos/{id}")
    String getErrorPayment(@PathVariable("id") Integer id);
}
