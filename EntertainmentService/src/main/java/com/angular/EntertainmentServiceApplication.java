package com.angular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@SpringBootApplication
public class EntertainmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntertainmentServiceApplication.class, args);
	}
}
