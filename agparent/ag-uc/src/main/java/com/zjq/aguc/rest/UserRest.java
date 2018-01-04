package com.zjq.aguc.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserRest {
    @Value("${password:用户名}")
    private String content;
    @RequestMapping("/{id}")
    public String getUserInfo(@PathVariable String id){
        return content;
    }
}
