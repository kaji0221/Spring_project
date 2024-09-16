package com.example.demo.animalsAPI.controller;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AnimalController {

	@Autowired
	private AnimalService animalService;

	@GetMapping("animal-search")
	public String showSerchPage(Model model) {
		List<AnimalData> animals = animalService.getAllAnimals();
		model.addAttribute("animals", animals);
		return "animal-search";
	}

	@PostMapping("animal-detail")
	public String showAnimalDetail(@RequestParam("animalId") int animalId, Model model) {
		AnimalData animal = animalService.getAnimalById(animalId);
		model.addAttribute("animal", animal);
		return "animal-detail";
	}
}