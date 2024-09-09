package com.example.demo.fizzBuzz.controller;

import com.example.demo.fizzBuzz.service.FizzBuzzService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class FizzBuzzController {

	private final FizzBuzzService fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}

	@GetMapping("fizzbuzz")
	public String showFizzBuzz(Model model) {
		List<String> fizzBuzzList = fizzBuzzService.generateFizzBuzzList(100);
		fizzBuzzList.add(0, "FizzBuzz");
		model.addAttribute("numbers", fizzBuzzList);
		return "fizzBuzz.html";
	}
}