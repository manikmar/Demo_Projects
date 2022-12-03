package com.mer.demo.controller;

import com.mer.demo.repository.Order;
import com.mer.demo.service.OrderImpl;
import com.mer.demo.service.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    //8012

    @Autowired
    OrderInfo orderInfo;

    @GetMapping(value = "/get_all_orders")
    public List<Order> getAllOrders() {
        return orderInfo.getAllOrders();
    }

    @PostMapping("/add_order")
    public Order addOrder(@RequestBody Order order) {
        return orderInfo.addOrder(order);
    }
}
