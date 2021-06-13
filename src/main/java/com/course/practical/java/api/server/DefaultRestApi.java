package com.course.practical.java.api.server;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class DefaultRestApi {

	@GetMapping(value="/welcome")
	public String Welcome() {
		System.out.println(StringUtils.join("Hello", "this is", "Spring Boot REST"));
		return "Welcome to SpringBoot";
	}
	
	@GetMapping(value="/time")
	public String time() {
		return LocalTime.now().toString();
	}
}
