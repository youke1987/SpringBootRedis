/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.redis.domain;

import java.io.Serializable;

/**
 * Created by qiaoshuang on 2017/1/16.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 7933662969223949922L;

    private String id;

    private String name;

    private Integer age;

    public Person() {
        super();
    }

    public Person(String id, String name, Integer age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person[id=" + this.id + "; name=" + this.name + "; age=" + this.age + "]";
    }
}
