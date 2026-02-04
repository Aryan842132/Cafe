package com.cafe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.model.BookOrder;
import com.cafe.service.BookOrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin("*")
public class BookOrderController {

    private final BookOrderService service;

    public BookOrderController(BookOrderService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<BookOrder> placeOrder(
            @RequestBody BookOrder order) {
        return ResponseEntity.ok(service.saveOrder(order));
    }
}
