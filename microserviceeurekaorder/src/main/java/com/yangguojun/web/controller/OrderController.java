package com.yangguojun.web.controller;

import com.yangguojun.web.config.ServiceInfoUtil;
import com.yangguojun.web.po.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order/{id}")
    public String findOrderById(@PathVariable String id) {
        Order order = new Order();
        order.setId(id);
        order.setPrice(23.5);
        order.setReceiverAddress("beijing");
        order.setReceiverName("xiaoqiang");
        order.setReceiverPhone("110");
        System.out.println(ServiceInfoUtil.getPort());
        return order.toString();
    }
}
