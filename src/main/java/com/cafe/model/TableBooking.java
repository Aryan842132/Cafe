package com.cafe.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "table_bookings")
public class TableBooking {

    @Id
    private String id;

    private String name;
    private String phoneNumber;
    private LocalDate bookingDate;
    private LocalTime bookingTime;
    private String tableNumber;

    private LocalDateTime createdAt;
}
