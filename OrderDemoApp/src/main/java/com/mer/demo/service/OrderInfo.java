package com.mer.demo.service;

import com.mer.demo.repository.Order;

import java.util.List;

public interface OrderInfo {

    public List<Order> getAllOrders();
    public Order addOrder(Order order);
}
