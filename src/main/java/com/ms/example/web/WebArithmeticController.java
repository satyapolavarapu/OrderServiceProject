package com.ms.example.web;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebArithmeticController {
	@Autowired
	protected WebOrderService additionService;

	@Autowired
	protected WebOrderItemService subtractionService;

	protected Logger logger = Logger.getLogger(WebArithmeticController.class
			.getName());

	public WebArithmeticController(WebOrderService additionService, WebOrderItemService subtractionService) {
		this.additionService = additionService;
		this.subtractionService = subtractionService;
	}

	@RequestMapping("/order")
	public String doAdd(@RequestParam(defaultValue="0") String addend1,
			@RequestParam(defaultValue="0") String addend2,
			Model model) {

		String sum = additionService.add(addend1, addend2);

		logger.info("Sum: " + sum);
		model.addAttribute("json", sum);

		return "sum";
	}

	@RequestMapping("/orderItem")
	public String doSubtract(@RequestParam(defaultValue="0") String minuend,
			@RequestParam(defaultValue="0") String subtrahend,
			Model model) {

		String difference = subtractionService.subtract(minuend, subtrahend);

		logger.info("Difference: " + difference);
		model.addAttribute("json", difference);

		return "difference";
	}
}
