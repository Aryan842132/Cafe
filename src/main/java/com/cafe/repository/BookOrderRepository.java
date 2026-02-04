package com.cafe.repository;

import com.cafe.model.BookOrder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookOrderRepository extends MongoRepository<BookOrder, String> {
}
