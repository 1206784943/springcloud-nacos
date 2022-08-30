package com.example.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author liujiabin
 * @Date 2022/8/29 16:14
 */
@FeignClient(name = "provide",fallback = ProvideFailFeign.class)
public interface ProvideFeign {

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id);

    @GetMapping("/errorPayment/nacos/{id}")
    public String getErrorPayment(@PathVariable("id") Integer id);
}
