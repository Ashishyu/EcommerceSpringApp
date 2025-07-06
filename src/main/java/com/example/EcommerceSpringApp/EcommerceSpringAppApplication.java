package com.example.EcommerceSpringApp;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringAppApplication {

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure().load(); // Load env variables from .env

		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue())); // Set system properties from dot env

		SpringApplication.run(EcommerceSpringAppApplication.class, args);
	}

}
