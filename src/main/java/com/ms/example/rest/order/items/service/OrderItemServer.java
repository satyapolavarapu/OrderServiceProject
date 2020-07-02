package com.ms.example.rest.order.items.service;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class OrderItemServer {
	protected Logger logger = Logger.getLogger(OrderItemServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "orderItem-server");

		SpringApplication.run(OrderItemServer.class, args);
	}
}
