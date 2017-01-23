/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.redis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.apopo.springboot.redis.domain.Person;
import cn.apopo.springboot.redis.domain.PersonDao;

/**
 * Created by qiaoshuang on 2017/1/16.
 */
@RestController
@RequestMapping("redis/object")
public class ObjectRedisController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/setPerson")
    public String set(String id, String name,Integer age){
        Person person = new Person(id, name, age);
        personDao.save(person);
        return person.toString();
    }

    @RequestMapping("/getPerson")
    @Cacheable(value="user-key")
    public Person getPerson(String id){
        System.out.println("从数据库获取");
        return personDao.getPerson(id);
    }

}
