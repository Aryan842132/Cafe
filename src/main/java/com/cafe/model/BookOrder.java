package com.cafe.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "book_orders")
public class BookOrder {

    @Id
    private String id;

    private String customerName;
    private String tableNumber;
    private String itemName;
    private int quantity;
    private String phoneNumber;

    private LocalDateTime orderTime;
}
