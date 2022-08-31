package com.example.customer.feign;

import org.springframework.stereotype.Component;

/**
 * 影响测试判断，暂不使用
 * @Author liujiabin
 * @Date 2022/8/29 16:15
 */
@Component
public class ProvideFailFeign implements ProvideFeign {
    public String getPayment(Integer id) {
        return "getPayment降级了";
    }

    public String getErrorPayment(Integer id) {
        return "getErrorPayment降级了";
    }
}
