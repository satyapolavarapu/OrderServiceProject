package com.ms.example.rest.order.service;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class OrderServer {

	protected Logger logger = Logger.getLogger(OrderServer.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "order-server");

		SpringApplication.run(OrderServer.class, args);
	}
}
