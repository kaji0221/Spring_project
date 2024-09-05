package com.example.demo.minus.controller;

import com.example.demo.minus.service.MinusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MinusController {

	@Autowired
	private MinusService minusService;

	@GetMapping("/minus")
	public String subtract(@RequestParam(value = "num1", required = false, defaultValue = "0") int num1,
			                @RequestParam(value = "num2", required = false, defaultValue = "0") int num2,
			Model model) {
		int result = minusService.subtract(num1, num2);
		model.addAttribute("result", result);
		return "minus";
	}

}