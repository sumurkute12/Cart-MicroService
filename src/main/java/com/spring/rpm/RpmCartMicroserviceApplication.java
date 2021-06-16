package com.spring.rpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author Swapnil,Rishav,Amit,Siddhi
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class RpmCartMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpmCartMicroserviceApplication.class, args);
	}

	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplateBean() {
		return new RestTemplate();
	}	
	
	
}
