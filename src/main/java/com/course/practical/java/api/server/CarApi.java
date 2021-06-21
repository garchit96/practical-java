package com.course.practical.java.api.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.practical.java.entity.Car;
import com.course.practical.java.service.CarService;
@RestController
@RequestMapping(value="/api/car/vi")
public class CarApi {
	@Autowired
	private CarService carService;
	@GetMapping(value="/random", produces=MediaType.APPLICATION_JSON_VALUE)
	public Car random() {
		return carService.generateCar();
	}
}
