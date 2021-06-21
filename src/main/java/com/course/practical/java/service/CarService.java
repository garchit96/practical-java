package com.course.practical.java.service;

import java.util.List;

import com.course.practical.java.entity.Car;

public interface CarService {
	
	List<String> BRANDS= List.of("Toyota","Honda","Ford");
	
	List<String> COLORS= List.of("Red", "Black","White");
	
	List<String> TYPES= List.of("Sedan", "SUV","MPV");
	
	Car generateCar();
}
