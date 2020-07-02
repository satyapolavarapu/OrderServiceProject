package com.ms.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(useDefaultFilters = false)
public class WebServer {

	public static final String ORDER_SERVICE_URL = "http://order-service";

	public static final String ORDER_ITEM_SERVICE_URL = "http://orderItem-service";

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "web-server");
		SpringApplication.run(WebServer.class, args);
	}

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	public WebOrderService additionService() {
		return new WebOrderService(ORDER_SERVICE_URL);
	}

	@Bean
	public WebArithmeticController additionController() {
		return new WebArithmeticController(additionService(), subtractionService());
	}

	@Bean
	public WebOrderItemService subtractionService() {
		return new WebOrderItemService(ORDER_ITEM_SERVICE_URL);
	}

	@Bean
	public HomeController homeController() {
		return new HomeController();
	}
}