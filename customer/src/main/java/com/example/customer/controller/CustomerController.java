package com.example.customer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.example.customer.feign.ProvideFeign;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author liujiabin
 * @Date 2022/8/8 15:14
 */
@RestController
@RefreshScope
public class CustomerController {
    @Value( "${config.name}")
    private String name;
    @Resource
    private ProvideFeign provideFeign;
    @Resource
    private CustomerService customerService;

    @GetMapping("/configName")
    @SentinelResource(blockHandler = "getConfigBlock")
    public String configName() {
        return name;
    }

    @GetMapping("/getProvideData")
    @SentinelResource(blockHandler = "getConfigBlock") //未生效，原因未知
    public String getProvideData() {
        String payment = provideFeign.getPayment(33);
        return payment;
    }

    @GetMapping("/getProvideErrorData/{id}")
    @SentinelResource(blockHandler = "getConfigBlock") //未生效，原因未知
    public String getProvideErrorData(@PathVariable Integer id) {
        String payment = provideFeign.getErrorPayment(id);
        return payment;
    }

    @GetMapping("/updateCustomer/{id}")
    @SentinelResource(blockHandler = "getConfigBlock") //未生效，原因未知
    public String updateCustomer(@PathVariable Integer id) {
        customerService.updateCustomer(id);
        return "SUCCESS";
    }

    /**
     * 流控提示
     * @param e
     * @return
     */
    public String getConfigBlock(BlockException e) {
        return "你已被流控";
    }
}
