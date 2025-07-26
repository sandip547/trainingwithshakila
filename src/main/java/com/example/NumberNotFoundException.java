package com.example;

public class NumberNotFoundException extends RuntimeException{

    NumberNotFoundException(String message){
        super(message);
    }
}
