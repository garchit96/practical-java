package com.course.practical.java.api.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.practical.java.entity.Car;
import com.course.practical.java.service.CarService;
@RestController
@RequestMapping(value="/api/car/vi")
public class CarApi {
	
	private static final Logger LOG=LoggerFactory.getLogger(CarApi.class);
	
	@Autowired
	private CarService carService;
	@GetMapping(value="/random", produces=MediaType.APPLICATION_JSON_VALUE)
	public Car random() {
		return carService.generateCar();
	}
	@PostMapping(value="/echo", consumes=MediaType.APPLICATION_JSON_VALUE)
	public String echo(@RequestBody Car car) {
		LOG.info("Car is {}", car);
		return car.toString();	}
}
