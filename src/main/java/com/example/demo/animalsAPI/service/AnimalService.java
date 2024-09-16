package com.example.demo.animalsAPI.service;

import com.example.demo.animalsAPI.data.AnimalData;
import com.example.demo.animalsAPI.repository.AnimalRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;

	public List<AnimalData> getAllAnimals() {
		return animalRepository.findAllAnimals();
	}

	public AnimalData getAnimalById(int id) {
		return animalRepository.findAnimalById(id);
	}
}