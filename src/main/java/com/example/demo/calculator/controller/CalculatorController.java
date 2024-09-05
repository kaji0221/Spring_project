package com.example.demo.calculator.controller;

import com.example.demo.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@GetMapping("getcalculator")
	public String getCalculator() {
		return "calculator.html";
	}

	@PostMapping("calculator")
	public String calculate(@RequestParam("number1") int number1, @RequestParam("symbol") String symbol,
			@RequestParam("number2") int number2, Model model) {
		try {
			int result = calculatorService.calculator(number1, symbol, number2);
			model.addAttribute("result", result);
		} catch (ArithmeticException e) {
			model.addAttribute("result", "ゼロ除算はできません");
		}
		return "calculator";
	}
}
