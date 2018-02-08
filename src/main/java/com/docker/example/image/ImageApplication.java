package com.docker.example.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageApplication.class, args);
	}
}
