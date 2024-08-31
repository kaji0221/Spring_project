package com.example.demo.multi.service;

import org.springframework.stereotype.Service;

@Service
public class MultiService {
	public int calculateMultiplication(int number, int number2) {
		return number * number2;
	}
}