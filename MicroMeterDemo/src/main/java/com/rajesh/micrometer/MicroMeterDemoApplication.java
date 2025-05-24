package com.rajesh.micrometer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroMeterDemoApplication {
	
	@GetMapping("/")
	public String getStatus() {
		return "It is Working";
	}

	@GetMapping("/name")
	public String getName() {
		return "Hethvik Kumar Reddy";
	}
	
	@GetMapping("/fullname")
	public String getFullName() {
		return "Hethvik Kumar Reddy Kamireddy";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MicroMeterDemoApplication.class, args);
	}

}
