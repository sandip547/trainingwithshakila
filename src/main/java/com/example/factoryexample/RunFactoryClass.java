package com.example.factoryexample;

import com.example.Person;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunFactoryClass {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person(UUID.randomUUID(),34),new Person(UUID.randomUUID(),36));
        new ArrayList<>();
        Integer []  a = new Integer[6];
        System.out.println("Hello tehreee");

//        for (Integer i: list){
//            System.out.println(i);
//        }



        list.stream().forEach(val -> {
            System.out.println(val);
        });

        Stream<Person> streamexample= list.stream();

       // System.out.println(streamexample.toArray());
        Stream<Person> stream = streamexample.map(val -> new Person(val.getId(),"admin",val.getAge()+1));

        System.out.println(stream.toArray());
        List<Person> stream1 = stream.toList();
        System.out.println(stream1);

        List<Person> formattedVals = null;
        try {
            formattedVals = list.stream().
                    map(val -> new Person(val.getId(),"admin",val.getAge()+1)).
                    toList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


       // System.out.println(formattedVals);

    }
}
