package ru.merkel.calculator.services;

public interface CalculatorService {
    String calculator();
    String plus(Integer num1, Integer num2);
    String minus(Integer num1, Integer num2);
    String multiply(Integer num1, Integer num2);
    String divide(Float num1, Integer num2);
}
