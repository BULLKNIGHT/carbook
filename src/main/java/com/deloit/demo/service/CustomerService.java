package com.deloit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloit.demo.dao.CustomerRepo;
import com.deloit.demo.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo cusrepo;
	
	public List<Customer> getAllCustomer()
	{
		return cusrepo.findAll();
	}
	
	public String addCustomer(Customer customer)
	{
		cusrepo.save(customer);
		return "Customer Details Save Successfully";
	}
	
	public String updateCustomer(Customer customer)
	{
		Customer temp=cusrepo.findById(customer.getCusid()).orElse(null);
		if(temp==null)
			return "Customer Id Invalid";
		cusrepo.save(customer);
		return "Customer Details Updated successfully";
	}
	
	public String deleteCustomer(String cusid)
	{
		Customer temp=cusrepo.findById(cusid).orElse(null);
		if(temp==null)
			return "Customer Id Invalid";
		cusrepo.deleteById(cusid);
		return "Customer Details Deleted";
	}

}
