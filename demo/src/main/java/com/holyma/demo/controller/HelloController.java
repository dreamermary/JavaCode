package com.holyma.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 使方法的数据返回皆为json格式
public class HelloController {

    // 负责页面访问控制：路由&视图函数(逻辑处理，数据返回)
    @RequestMapping("hello")
    public String index(){
        return "hello world";
    }

}
