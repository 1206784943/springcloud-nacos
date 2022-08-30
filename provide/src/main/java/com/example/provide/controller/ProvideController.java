package com.example.provide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liujiabin
 * @Date 2022/8/8 15:14
 */
@RestController
public class ProvideController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/nacos/{id}")
    public String getPayment(@PathVariable Integer id) {
        return "nacos 注册中⼼，服务端⼝:" + serverPort + "\t id" + id;
    }

    @GetMapping("/errorPayment/nacos/{id}")
    public String getErrorPayment(@PathVariable("id") Integer id) {
        int i = 1 / id;
        return "nacos 注册中⼼，服务端⼝:" + serverPort + "\t id" + id;
    }
}
