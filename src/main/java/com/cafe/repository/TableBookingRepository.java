package com.cafe.repository;

import com.cafe.model.TableBooking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableBookingRepository extends MongoRepository<TableBooking, String> {
}
