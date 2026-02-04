package com.cafe.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.cafe.model.ContactMessage;
import com.cafe.repository.ContactMessageRepository;

@Service
public class ContactMessageService {

    private final ContactMessageRepository repository;

    public ContactMessageService(ContactMessageRepository repository) {
        this.repository = repository;
    }

    public ContactMessage saveMessage(ContactMessage message) {
        message.setSentAt(LocalDateTime.now());
        return repository.save(message);
    }
}
