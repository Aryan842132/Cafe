package com.cafe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.model.TableBooking;
import com.cafe.service.TableBookingService;

@RestController
@RequestMapping("/api/table-bookings")
@CrossOrigin("*")
public class TableBookingController {

    private final TableBookingService service;

    public TableBookingController(TableBookingService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TableBooking> bookTable(
            @RequestBody TableBooking booking) {
        return ResponseEntity.ok(service.bookTable(booking));
    }
}
