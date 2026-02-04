package com.cafe.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.cafe.model.TableBooking;
import com.cafe.repository.TableBookingRepository;

@Service
public class TableBookingService {

    private final TableBookingRepository repository;

    public TableBookingService(TableBookingRepository repository) {
        this.repository = repository;
    }

    public TableBooking bookTable(TableBooking booking) {
        booking.setCreatedAt(LocalDateTime.now());
        return repository.save(booking);
    }
}
