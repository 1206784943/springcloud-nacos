package com.example.provide.service;

import com.example.provide.dao.CustomerDao;
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
    public void updateCustomer(Integer id) {
        customerDao.updateCustomer(id);
        int i = 1 / id;
    }
}
