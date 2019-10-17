package com.deloit.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloit.demo.dao.CarRepo;
import com.deloit.demo.model.Car;

@Service
public class CarService {

	@Autowired
	private CarRepo cr;
	
	public List<Car> getAllCar()
	{
		return cr.findAll();
	}
	
	public String addCar(Car car)
	{
		cr.save(car);
		return "Car Details Save Successfully";
	}
	
	public String updateCar(Car car)
	{
		Car temp=cr.findById(car.getCarnumber()).orElse(null);
		if(temp==null)
			return "Car Number Not valid";
		cr.delete(temp);
		cr.save(car);
		return "Car Data updated Successfully";
	}
	
	public String deleteCarById(String carno)
	{
		Car temp=cr.findById(carno).orElse(null);
		if(temp==null)
			return "Car Number Not Valid";
		cr.deleteById(carno);
		return "Car Data Deleted with Number "+ carno;
	}
	
	public void makingUnavailable(String carnumber)
	{
		Car temp=cr.findById(carnumber).orElse(null);
		temp.setAvailable(false);
		cr.save(temp);
	}
}
