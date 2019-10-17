package com.deloit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloit.demo.dao.BookingRepo;
import com.deloit.demo.dao.CarRepo;
import com.deloit.demo.dao.CustomerRepo;
import com.deloit.demo.model.Booking;
import com.deloit.demo.model.Car;
import com.deloit.demo.model.Customer;
import com.deloit.demo.service.CarService;
import com.deloit.demo.service.CustomerService;

@RestController
public class BookingController {
	
	@Autowired
	private CarService carser; 
	
	@Autowired
	private CustomerService cusser;
	
	@Autowired
	private CustomerRepo cusrepo;
	
	@Autowired
	private CarRepo carrepo;
	
	@Autowired
	private BookingRepo bk;
	
	@GetMapping("/")
	public String booking()
	{
		return "In booking";
	}
	
	@GetMapping("/availablecar")
	public List<Car> getAllAvailableCars()
	{
		return carrepo.findByAvailable(true);
	}
	
	@GetMapping("/bookedcar")
	public List<Car> getAllBookedCars()
	{
		return carrepo.findByAvailable(false);
	}
	
	@PutMapping("/booking")
	public String bookCarById(@RequestBody Booking booking)
	{
		Car temp=carrepo.findById(booking.getCarnumber()).orElse(null);
		Customer cus=cusrepo.findById(booking.getCusid()).orElse(null);
		if(temp==null || cus==null)
			return "Enter Car or Customer Data Is Not Valid";
		if(!temp.isAvailable())
			return "Car Not Available";
		bk.save(booking);
		temp.setAvailable(false);
		temp.setBookid(booking.getBookid());
		carrepo.save(temp);
		cus.setBookid(booking.getBookid());
		cusrepo.save(cus);
		return "Car Booked Successfully";
	}

}
