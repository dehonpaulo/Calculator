package com.example.calculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(InvalidValueException.class)
    public ResponseEntity<ErrorBody> handleInvalidValueException(InvalidValueException invalidValueException, HttpServletRequest request) {
        ErrorBody errorBody = new ErrorBody(LocalDateTime.now(), 400, "bad request", invalidValueException.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorBody);
    }


}