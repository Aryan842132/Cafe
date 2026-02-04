package com.cafe.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "contact_messages")
public class ContactMessage {

    @Id
    private String id;

    private String name;
    private String email;
    private String phone;
    private String message;

    private LocalDateTime sentAt;
}
