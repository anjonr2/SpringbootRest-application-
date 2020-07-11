package com.example.spring.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.example"})
public class DemoSpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootRestApplication.class, args);
	}

}
