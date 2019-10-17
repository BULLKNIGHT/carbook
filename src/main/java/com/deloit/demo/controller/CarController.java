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

import com.deloit.demo.model.Car;
import com.deloit.demo.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService cs;
	
	@GetMapping("/")
	public String home()
	{
		return "Home";
	}
	
	@GetMapping("/getall")
	public List<Car> getAllCar()
	{
		return cs.getAllCar();
	}
	
	@PostMapping("/add")
	public String addCar(@RequestBody Car car)
	{
		return cs.addCar(car);
	}
	
	@PutMapping("/update")
	public String updateCar(@RequestBody Car car)
	{
		return cs.updateCar(car);
	}
	
	@DeleteMapping("/delete/{carno}")
	public String deleteCarById(@PathVariable("carno") String carno)
	{
		return cs.deleteCarById(carno);
	}
}
