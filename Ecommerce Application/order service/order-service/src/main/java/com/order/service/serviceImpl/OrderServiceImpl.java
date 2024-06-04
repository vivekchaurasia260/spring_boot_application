package com.order.service.serviceImpl;

import com.order.service.entities.Order;
import com.order.service.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order createOrder(Order order) {
        return null;
    }

    @Override
    public Optional<Order> getOrderById(long orderId) {
        return Optional.empty();
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void deleteOrder(long orderId) {

    }

    @Override
    public Order updateOrder(long orderId, Order order) {
        return null;
    }

    @Override
    public List<Order> getOrderByStatus(String status) {
        return null;
    }
}
