/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.redis.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiaoshuang on 2017/1/16.
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("")
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
