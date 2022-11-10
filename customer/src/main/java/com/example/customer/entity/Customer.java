package com.example.customer.entity;

/**
 * @Author liujiabin
 * @Date 2022/8/31 13:18
 */
public class Customer {
    private Integer id;
    private String name;
    private String describe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
