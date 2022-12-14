package com.example.customer.service;

import com.example.customer.dao.CustomerDao;
import com.example.customer.feign.ProvideFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author liujiabin
 * @Date 2022/8/31 10:53
 */
@Service
public class CustomerService {
    @Resource
    private CustomerDao customerDao;
    @Resource
    private ProvideFeign provideFeign;

    @GlobalTransactional
    public void updateCustomer(Integer id) {
        customerDao.updateCustomer(id);
        provideFeign.getErrorPayment(id);
    }
}
