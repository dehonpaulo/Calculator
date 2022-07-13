package com.example.calculator.controller;


import com.example.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public ResponseEntity<Double> division(@RequestParam Double n1, @RequestParam Double n2) {
        return ResponseEntity.status(HttpStatus.OK).body(calculatorService.division(n1, n2));
    }

}