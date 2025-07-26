package com.example;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        //getSomething(Map<String,String> a() -> user can add -> HashMap or TreeMap
        //HashMap<K,V> name = new HashMap<>();
        Person shakila = new Person(UUID.randomUUID(),"Shakila",30);
        Person manish = new Person(UUID.randomUUID(),"Manish",32);
        Person john = new Person(UUID.randomUUID(),"John",64);
        Map<UUID,Person> map = new HashMap<>();
        map.put(shakila.getId(),shakila);
        map.put(manish.getId(),manish);
        map.put(john.getId(),john);
        map.put(john.getId(),shakila);

        System.out.println(map);

        System.out.println(map.get(shakila.getId()));

        for (UUID key: map.keySet()){
            System.out.println(key);
        }
        for (Person person: map.values()){
            System.out.println(person.toString());
        }

        for (Map.Entry<UUID,Person> entrySet : map.entrySet()){
            System.out.println(entrySet.getKey() + " details:" + entrySet.getValue());
        }
    }
}
