package com.kyn.KnowYourNeighbour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.kyn.KnowYourNeighbour.configuration.AppProperties;



@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
//Enable AppPropterties Configuration class to use in TokenProvider Class
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

}