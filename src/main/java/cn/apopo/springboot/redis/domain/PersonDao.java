/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.redis.domain;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * Created by qiaoshuang on 2017/1/16.
 */
@Repository
public class PersonDao {

//    @Autowired
//    RedisTemplate<Object,Object> redisTemplate;

    @Resource(name="redisTemplate")
    ValueOperations<Object,Object> valOps;

    public void save(Person person){
        valOps.set(person.getId(), person);
    }

    public Person getPerson(String id){
        return (Person) valOps.get(id);
    }

}
