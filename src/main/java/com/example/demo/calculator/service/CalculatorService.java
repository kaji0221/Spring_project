package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public int calculator(int number1, String symbol, int number2) throws ArithmeticException {
		switch (symbol) {
		case "+":
			return number1 + number2;
		case "-":
			return number1 - number2;
		case "×":
			return number1 * number2;
		case "÷":
			if (number2 == 0) {
				throw new ArithmeticException("ゼロ除算");
			}
			return number1 / number2;
		default:
			throw new IllegalArgumentException("無効な演算子");
		}
	}
}
