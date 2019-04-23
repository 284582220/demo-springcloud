package com.yangguojun.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findOrdersByUser/{id}")
    public String findOrdersByUser(@PathVariable String id){
        // 假
        return this.restTemplate.getForObject("http://MICROSERVICE-EUREKA-ORDER/order/" + id, String.class);
    }
}
