package com.splendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = {"com.splendor", "com.splendor.repository"})
@EntityScan("com.splendor.repository")
public class SplendorWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SplendorWebAppApplication.class, args);

		
	}

}
