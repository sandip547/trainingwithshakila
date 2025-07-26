package com.example.factoryexample;

public class FactoryClass {

    public Payment getInstance(String instanceName){
        if(instanceName == "paypal"){
            return new PayPal();
        } else if (instanceName == "creditcard") {
            return new CreditCard();
        }
        return null;
    }
}
