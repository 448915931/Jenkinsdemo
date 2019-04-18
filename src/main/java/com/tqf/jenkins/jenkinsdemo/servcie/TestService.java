package com.tqf.jenkins.jenkinsdemo.servcie;

import org.springframework.stereotype.Service;

/**
 * Created by Tang-QiFeng on 2019/4/18
 */
@Service
public class TestService {

    public String test(){
        return "哈哈";
    }

    public String test2(){
        return "嘻嘻";
    }
}
