package com.deloit.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloit.demo.model.Customer;
import com.deloit.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService cusser;
	
	@GetMapping("/")
	public String customer()
	{
		return "In Customer";
	}
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer)
	{
		return cusser.addCustomer(customer);
	}
	
	@GetMapping("/getall")
	public List<Customer> getAllCustomer()
	{
		return cusser.getAllCustomer();
	}
	
	@PutMapping("/update")
	public String updateCustomer(@RequestBody Customer customer)
	{
		return cusser.updateCustomer(customer);
	}
	
	@DeleteMapping("/delete/{cusid}")
	public String deleteCustomer(@PathVariable("cusid") String cusid)
	{
		return cusser.deleteCustomer(cusid);
	}
}
