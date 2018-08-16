package com.hua.springbootredis.controller;

import com.hua.springbootredis.redisService.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class redisController {
    @Autowired
    private RedisService redisService ;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public void demoTest(){
        redisService.set("1","value22222");
    }

}