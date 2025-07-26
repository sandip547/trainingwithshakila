package com.example.factoryexample;

public class CreditCard implements Payment{
    @Override
    public String processPayment() {
        return "Processing payment for CreditCard";
    }
}
