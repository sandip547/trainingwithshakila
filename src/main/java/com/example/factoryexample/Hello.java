package com.example.factoryexample;

public class Hello {
    public static void main(String[] args) {
        FuncInt fun = (int a,int b) -> {
            System.out.println("Hello there");
            return a+b;
        };
        System.out.println(fun.add(5,6));
    }
}
