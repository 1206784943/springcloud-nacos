package com.example.customer.service;

import com.example.customer.dao.CustomerDao;
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

    @GlobalTransactional
    public void updateCustomer(String id) {
        customerDao.updateCustomer(id);
    }
}
