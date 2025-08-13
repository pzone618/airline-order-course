package com.postion.airlineorderbackend.service;

import com.postion.airlineorderbackend.dto.OrderDto;
import java.util.List;

public interface OrderService {
    List<OrderDto> getAllOrders();
    OrderDto getOrderById(Long id);
    OrderDto createOrder(OrderDto orderDto);
    OrderDto updateOrder(Long id, OrderDto orderDto);
    void deleteOrder(Long id);
    OrderDto payOrder(Long id);
    void requestTicketIssuance(Long id); // 请求出票
    OrderDto cancelOrder(Long id);
    String queryTicketStatus(Long id); // 查询票务状态
}
