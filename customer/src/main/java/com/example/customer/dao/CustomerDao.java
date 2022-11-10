package com.example.customer.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @Author liujiabin
 * @Date 2022/8/31 11:15
 */
@Mapper
public interface CustomerDao{
    void updateCustomer(String id);
}
