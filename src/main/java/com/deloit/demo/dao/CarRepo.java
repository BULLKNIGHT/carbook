package com.deloit.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.deloit.demo.model.Car;

public interface CarRepo extends MongoRepository<Car, String> {
	
	List<Car> findByAvailable(boolean available);

}
