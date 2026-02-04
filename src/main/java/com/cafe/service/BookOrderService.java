package com.cafe.service;

import com.cafe.model.BookOrder;
import com.cafe.repository.BookOrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookOrderService {

    private final BookOrderRepository repository;

    public BookOrderService(BookOrderRepository repository) {
        this.repository = repository;
    }

    public BookOrder saveOrder(BookOrder order) {
        order.setOrderTime(LocalDateTime.now());
        return repository.save(order);
    }
}
