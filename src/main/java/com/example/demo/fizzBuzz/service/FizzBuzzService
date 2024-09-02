package com.example.demo.fizzBuzz.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FizzBuzzService {

	public List<String> generateFizzBuzzList(int n) {
		List<String> fizzBuzzList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzzList.add("FizzBuzz");
			} else if (i % 3 == 0) {
				fizzBuzzList.add("Fizz");
			} else if (i % 5 == 0) {
				fizzBuzzList.add("Buzz");
			} else {
				fizzBuzzList.add(String.valueOf(i));
			}
		}

		return fizzBuzzList;
	}
}