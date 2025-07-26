package com.example;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {

        Person shakila = new Person(56,"Shakila",30);
        Person manish = new Person(22,"Manish",32);
        Person john = new Person(33,"John",64);

        TreeMap<Integer,Person> map = new TreeMap<>();
        map.put(shakila.getIdInt(),shakila);
        map.put(manish.getIdInt(),manish);
        map.put(john.getIdInt(),john);

        NavigableMap<Integer,Person> desc = map.descendingMap();

        System.out.println(desc);
        System.out.println(map.keySet());

        System.out.println(map);
    }
}
