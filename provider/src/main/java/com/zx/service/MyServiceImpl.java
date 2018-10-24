package com.zx.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zx.api.MyService;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String pingMyService() {
        return "ping service successful";
    }
}
