package com.maoyan.study.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    IndexService indexService;

    public UserService(IndexService indexService){
        System.out.println("UserService construction方法.....");
        // System.out.println(indexService);
    }

    public void getIndexService() {
        System.out.println(indexService);
    }
}
