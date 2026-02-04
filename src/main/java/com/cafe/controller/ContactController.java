package com.cafe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafe.model.ContactMessage;
import com.cafe.service.ContactMessageService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin("*")
public class ContactController {

    private final ContactMessageService service;

    public ContactController(ContactMessageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ContactMessage> sendMessage(
            @RequestBody ContactMessage message) {
        return ResponseEntity.ok(service.saveMessage(message));
    }
}
