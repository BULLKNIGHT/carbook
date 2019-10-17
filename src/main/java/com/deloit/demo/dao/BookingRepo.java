package com.deloit.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deloit.demo.model.Booking;

public interface BookingRepo extends MongoRepository<Booking, String> {

}
