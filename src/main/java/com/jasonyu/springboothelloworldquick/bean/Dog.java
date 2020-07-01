package com.jasonyu.springboothelloworldquick.bean;

import org.springframework.stereotype.Component;

/**
 * @program:spring-boot-helloworld-quick
 * @description:
 * @author:JasonYu
 * @date:2020-06-17 21-43
 **/
@Component
public class Dog {

    private String name;
    private Integer age;

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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
