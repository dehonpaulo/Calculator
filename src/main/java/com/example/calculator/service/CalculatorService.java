package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService {

    public Double division(Double n1, Double n2) {
        return n1/n2;
    }

}

