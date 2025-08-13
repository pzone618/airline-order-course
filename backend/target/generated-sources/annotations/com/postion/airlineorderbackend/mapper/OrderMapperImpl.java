package com.postion.airlineorderbackend.mapper;

import com.postion.airlineorderbackend.dto.OrderDto;
import com.postion.airlineorderbackend.model.Order;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-13T14:07:06+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public OrderDto toDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDto orderDto = new OrderDto();

        orderDto.setId( order.getId() );
        orderDto.setOrderNumber( order.getOrderNumber() );
        orderDto.setStatus( order.getStatus() );
        orderDto.setAmount( order.getAmount() );
        orderDto.setCreationDate( order.getCreationDate() );
        orderDto.setUser( userMapper.toDto( order.getUser() ) );

        return orderDto;
    }

    @Override
    public Order toEntity(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( orderDto.getId() );
        order.setOrderNumber( orderDto.getOrderNumber() );
        order.setStatus( orderDto.getStatus() );
        order.setAmount( orderDto.getAmount() );
        order.setCreationDate( orderDto.getCreationDate() );

        return order;
    }

    @Override
    public Order updateOrderFromDto(OrderDto orderDto, Order order) {
        if ( orderDto == null ) {
            return order;
        }

        order.setOrderNumber( orderDto.getOrderNumber() );
        order.setStatus( orderDto.getStatus() );
        order.setAmount( orderDto.getAmount() );
        order.setCreationDate( orderDto.getCreationDate() );

        return order;
    }
}
