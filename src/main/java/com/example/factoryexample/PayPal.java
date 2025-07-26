package com.example.factoryexample;

public class PayPal implements Payment{
    @Override
    public String processPayment() {
        return "processing Payment fro Paypal";
    }
}
