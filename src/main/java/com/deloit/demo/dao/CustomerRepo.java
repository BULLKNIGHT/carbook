package com.deloit.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deloit.demo.model.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String> {

}
