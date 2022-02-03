package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HelloWorldBean {
    private String message;

//    @AllArgsConstructor 로 해결
//    public HelloWorldBean(String message) {
//        this.message = message;
//    }
}
