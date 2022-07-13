package com.example.calculator.service;

import com.example.calculator.exception.InvalidValueException;
import org.springframework.stereotype.Service;

@Service

public class CalculatorService {

    public Double division(Double n1, Double n2) {
        if(n2 == 0.0) throw new InvalidValueException("Não pode dividir por zero");
        return n1/n2;
    }

}

