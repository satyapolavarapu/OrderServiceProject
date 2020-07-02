package com.ms.example.rest.order.items.service;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemController {
	protected Logger logger = Logger.getLogger(OrderItemController.class
			.getName());

	@RequestMapping("/orderItem")
	public String getOrderItemDetails(@RequestParam(defaultValue="0") int productCode,
			@RequestParam(defaultValue="0") String prodcutName,
			@RequestParam(defaultValue="0") String Quantity) {

		

		return "";
	}
}
