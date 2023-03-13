package com.example.testproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(ProductException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorRespone handlerProductException(ProductException ex, WebRequest req){
        return new ErrorRespone(HttpStatus.NOT_FOUND,ex.getMessage());
    }
}
