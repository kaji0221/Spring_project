package com.example.demo.animalsAPI.repository;

import java.io.IOException;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import com.example.demo.animalsAPI.data.AnimalData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalRepository {

	public List<AnimalData> getAnimalById(int id) throws IOException {
		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI?id=" + id;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		String json = response.getBody();

		ObjectMapper objectMapper = new ObjectMapper();
		List<AnimalData> animalList = objectMapper.readValue(json, new TypeReference<List<AnimalData>>() {
		});
		return animalList;
	}

	public List<AnimalData> getAllAnimals() throws IOException {
		String url = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI"; // 全ての動物取得
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		String json = response.getBody();

		ObjectMapper objectMapper = new ObjectMapper();
		List<AnimalData> animalList = objectMapper.readValue(json, new TypeReference<List<AnimalData>>() {
		});
		return animalList;
	}
}