package com.example.calculator.exception;

public class InvalidValueException extends RuntimeException{

    public InvalidValueException(String message) {
        super(message);
    }
}
