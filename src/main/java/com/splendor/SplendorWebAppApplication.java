package com.splendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.splendor", "com.splendor.repository"})
public class SplendorWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplendorWebAppApplication.class, args);

		
	}

}
