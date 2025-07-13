package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Integer> a = new ArrayList<>();
//        a.add(3);
//        a.add(4);
//
//        a.add(0,7);
//
//
//
//        System.out.println(a);


        List<Integer> arrayList = new ArrayList<>();

        int [] initialArray = new int[10]; // 7 values
        //copy from initial to nextarray
        int [] nextArray = new int[20]; // copy 7 values to nextArray  // using some memory 4bytes * 20
        List<Integer> linkedList = new LinkedList<>();



        //load factor = .75f
        //10
        for (int i=0;i<100000000;i++){
            arrayList.add(i+50);
        }

        for (int i=0;i<100000000;i++){
            linkedList.add(i+50);
        }

        long startTime  = System.currentTimeMillis();
        arrayList.get(99000000);
        long endTime = System.currentTimeMillis();
        System.out.println("array list time" + (endTime-startTime));
        //<-node1(10)address-> <-node2(67)-><-node3-> // singly linked list , doubly linked list // circular linked list

        long startTimeL  = System.currentTimeMillis();
        arrayList.get(99000000);
        long endTimeL = System.currentTimeMillis();
        System.out.println("linked list time" + (endTimeL-startTimeL));

    }
}