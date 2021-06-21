package com.course.practical.java.service;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.course.practical.java.entity.Car;
@Service
public class RandomCarService implements CarService {

	public Car generateCar() {
		String brand=BRANDS.get(ThreadLocalRandom.current().nextInt(0,BRANDS.size()));
		String color=COLORS.get(ThreadLocalRandom.current().nextInt(0,COLORS.size()));
		String type=TYPES.get(ThreadLocalRandom.current().nextInt(0,TYPES.size()));
		return new Car(brand,color,type);
	}

}
