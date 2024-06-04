package com.order.service.services;

import com.order.service.entities.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order createOrder(Order order);
    Optional<Order> getOrderById(long orderId);
    List<Order> getAllOrders();
    void deleteOrder(long orderId);
    Order updateOrder(long orderId, Order order);
    List<Order> getOrderByStatus(String status);

    // NOT IN USE



}
