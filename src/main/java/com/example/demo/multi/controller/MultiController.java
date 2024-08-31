package com.example.demo.multi.controller;

import com.example.demo.multi.service.MultiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MultiController {

	@Autowired
	private MultiService multiService;

	@GetMapping("multi")
	public String showResult(@RequestParam("number") int number, Model model) {
		int multiResult = multiService.calculateMultiplication(number, 6);
		model.addAttribute("multiResult", multiResult);
		return "multi.html";
	}
}