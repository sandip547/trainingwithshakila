package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) {
        // try catch throw  throws and finally

//        try {
//            int a [] = new int[5];
//            a[6] = 77;
//
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            int a = 6;
            new ExceptionHandling().readFile();
        } catch (NumberNotFoundException e) {
            System.out.println();
        }finally {
            System.out.println("hello");
        }

    }

    public void readFile() {
        int a = 7;
        if(a ==7){
            throw  new NumberNotFoundException("7 is not permitted");
        }
    }
}
