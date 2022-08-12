package com.example.customer.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liujiabin
 * @Date 2022/8/8 15:14
 */
@RestController
@RefreshScope
public class CustomerController {
    @Value("${server.port}")
    private String serverPort;
    @Value( "${config.name}")
    private String name;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable Integer id) {
        return "nacos 注册中⼼，服务端⼝:" + serverPort + "\t id" + id;
    }

    @GetMapping("/configName")
    public String getConfigName() {
        return name;
    }

}
