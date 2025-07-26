package com.example;

import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        Stack<Person> listOfP = new Stack<>();
        listOfP.push(new Person(UUID.randomUUID(),"Shakila",30));
        listOfP.push(new Person(UUID.randomUUID(),"Manish",32));
        listOfP.push(new Person(UUID.randomUUID(),"John",64));

        try {

            listOfP.
                    stream().
                    map(person -> new Person(person.getId(),person.getName())).
                    forEach(person ->
                    {System.out.println(person.toStringIa());});

//            for (Person p: listOfP){
//                System.out.println(p.toString());
//            }

            System.out.println(listOfP);
            Person p = listOfP.pop();

            System.out.println(p.toString());
            listOfP.pop();
            listOfP.pop();
            listOfP.pop();

            System.out.println(listOfP);
        } catch (EmptyStackException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("there");

        Person p = new Person(UUID.randomUUID(),"testPerson");
        System.out.println(p.toStringIa());

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(56);
        queue.add(57);
        queue.add(34);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.peek());
    }
}
