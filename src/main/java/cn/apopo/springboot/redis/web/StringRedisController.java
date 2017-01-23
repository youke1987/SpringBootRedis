/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.redis.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiaoshuang on 2017/1/16.
 */

@RestController
@RequestMapping("redis/string")
public class StringRedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource(name = "stringRedisTemplate")
    private ValueOperations<String, String> valOpsStr;

    @RequestMapping("set")
    public String setKeyAndValue(String key, String value){
        valOpsStr.set(key, value);
        return key + ": " + value;
    }

    @RequestMapping("get")
    public String getKey(String key){
        return valOpsStr.get(key);
    }
}
