package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Order;
import edu.wctc.wholesale.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order getOrder(int orderId) {
        List<Order> orderList = new ArrayList<>();
        orderRepository.findAll().forEach(orderList::add);
        return (Order) orderList;
    }

}
