package com.tqf.jenkins.jenkinsdemo.controller;

import com.tqf.jenkins.jenkinsdemo.servcie.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tang-QiFeng on 2019/4/18
 */
@RestController
@RequestMapping("/testapi")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     *  http://localhost:8080/jenkinsdemo/testapi/test
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return testService.test();
    }
}
