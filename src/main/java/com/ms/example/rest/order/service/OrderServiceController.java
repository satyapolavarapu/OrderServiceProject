									package com.ms.example.rest.order.service;

import java.util.Date;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceController {

	protected Logger logger = Logger.getLogger(OrderServiceController.class
			.getName());

	@RequestMapping("/order")
	public String getOrderDetails(@RequestParam(defaultValue="0") String customerName,
			@RequestParam(defaultValue="0") Date orderDate,
			@RequestParam(defaultValue="0") String shippingAddress,
			@RequestParam(defaultValue="0") String orderItems) {

		

		return "";
	}
}
