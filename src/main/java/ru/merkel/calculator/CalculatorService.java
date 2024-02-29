package ru.merkel.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (num2 != null && num1 != null) {
            return String.valueOf(num1 + num2);
        } else {
            return "Неправильно указаны параметры";
        }
    }

    public String minus(Integer num1, Integer num2) {
        if (num2 != null && num1 != null) {
            return String.valueOf(num1 - num2);
        } else {
            return "Неправильно указаны параметры";
        }
    }

    public String multiply(Integer num1, Integer num2) {
        if (num2 != null && num1 != null) {
            return String.valueOf(num1 * num2);
        } else {
            return "Неправильно указаны параметры";
        }
    }

    public String divide(Float num1, Integer num2) {
        if (num2 != null && num1 != null) {
            if (num2 != 0) {
                return String.valueOf(num1 / num2);
            } else {
                return "На 0 делить нельзя";
            }
        } else {
            return "Неправильно указаны параметры";
        }
    }
}
