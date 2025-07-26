package com.example.intabs;

import java.util.ArrayList;
import java.util.List;

public class RunClass {
    public static void main(String[] args) {
        UsingAbstract ab = new UsingAbstract();// the start //m1 -dont know
        System.out.println(ab.start());

        //if there is a change required in start you have change in parent class - abstract class

        AbstractExample ab1 = new UsingAbstractOne();// the start// - m1  dont know
        System.out.println(ab1.start());

        ArrayList<String> li  = new ArrayList<>();





    }
}
