package com.tarcisiolopes.moneyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.tarcisiolopes.moneyapi.config.properties.FinancasApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(FinancasApiProperty.class)
public class FinancasApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancasApiApplication.class, args);
	}

}
