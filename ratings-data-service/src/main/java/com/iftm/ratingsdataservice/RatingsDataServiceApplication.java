package com.iftm.ratingsdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingsDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingsDataServiceApplication.class, args);
	}

	/*
	 * @Bean
	 * 
	 * @LoadBalanced public RestTemplate getRestTemplate() { return new
	 * RestTemplate(); }
	 */
}
