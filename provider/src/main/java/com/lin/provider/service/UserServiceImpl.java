package com.lin.provider.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author lin
 * @version 00:59
 * @date 2023-07-16
 */
@Service(version = "1.0.0",timeout = 50000)
public class UserServiceImpl implements UserService{
    @Override
    public void add(int i) {

    }

    @Override
    public String getUser(String name) {
        return "这个是用户为"+name;
    }
}
