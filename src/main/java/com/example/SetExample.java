package com.example;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

       Comparator<Person> sorting_loginc =  new Comparator<>() {
           @Override
           public int compare(Person o1, Person o2) {
               if(o1.getAge()<o2.getAge()) return -1;
               if(o1.getAge()<o2.getAge()) return 1;
               return 0;
           }

        };


        List<Person> set = new ArrayList<>();
        set.add(new Person(UUID.randomUUID(),56));
        set.add(new Person(UUID.randomUUID(),22));
        set.add(new Person(UUID.randomUUID(),44));
        set.add(new Person(UUID.randomUUID(),11));
        set.add(new Person(UUID.randomUUID(),66));
       // Collections.sort(set,sorting_loginc);
//        Iterator it = set.iterator();
//        while (it.hasNext()){
//            Person p = (Person) it.next();
//            if(p.getAge()==22){
//                it.remove();
//            }
//        }
//
//        System.out.println(set);

        ListIterator it  = set.listIterator();

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.previous());
        System.out.println(it.previous());

    }
}
