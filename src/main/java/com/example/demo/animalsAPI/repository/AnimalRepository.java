package com.example.demo.animalsAPI.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import com.example.demo.animalsAPI.data.AnimalData;

@Repository
public class AnimalRepository {
	private final String API_URL = "https://wsaz0e6z45.execute-api.ap-northeast-1.amazonaws.com/prod/animalsAPI";

	public List<AnimalData> findAllAnimals() {
		   try {
		        RestTemplate restTemplate = new RestTemplate();
		        AnimalData[] animals = restTemplate.getForObject(API_URL, AnimalData[].class);
		        return Arrays.asList(animals);
		    } catch (Exception e) {
		        e.printStackTrace();  // エラーメッセージを表示
		        return new ArrayList<>();  // エラー時に空のリストを返す
		    }
		}

	public AnimalData findAnimalById(int id) {
		String url = API_URL + "?id=" + id;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, AnimalData.class);
	}
}
