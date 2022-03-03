package com.maoyan.study.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {

    @Autowired
    UserService userService;

    @Autowired
    IndexService indexService;

    public IndexService(){
        System.out.println("IndexService 构造函数......");
    }

    public void getUserService(){
        //System.out.println(userService);
    }
}
