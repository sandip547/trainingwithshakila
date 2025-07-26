package com.example;

import java.util.Formatter;
import java.util.UUID;
import java.util.logging.Logger;

public final class ExampleImmutable {
    private  final int a ;

    public int getA() {
        return a;
    }

    ExampleImmutable(int a){
        this.a = a;
    }

}

class B{
    public static void main(String[] args) {
//        ExampleImmutable exampleImmutable = new ExampleImmutable(1);
//        ExampleImmutable exampleImmutable1 = new ExampleImmutable(6);
//
//        System.out.println(exampleImmutable.getA() + exampleImmutable1.getA());
//        System.out.println(exampleImmutable1.getA());
//
//
//        String a ="Hello";
//        System.out.println(System.identityHashCode(a));
//        a = "Hello ";
//        System.out.println(System.identityHashCode(a));
//
//
//        String s1 = new String("Java");
//        System.out.println(s1);
//
//        String s2 = new String("C++");
//
//        System.out.println(s2);
//
//        System.out.printf("values has been added: %s %s",s1,s2);
//
//        String hello = STR."values has been added: \{s1} \{s2}";
//
//        System.out.println(hello);
//
//        String s5 = "hello"; // "hello"/ new String(hello)
//         s5 = "hello there"; // hello there // new String(hello there)
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        stringBuilder.append("hello");
//        stringBuilder.append("there");
//
//        StringBuffer stringBuffer = new StringBuffer();
//
//        stringBuffer.append("Hello");
//
//        System.out.println(Thread.currentThread());
//
//
//        System.out.println(stringBuilder);

//
//        String s1 = new String("Hello");
//        String s2 = new String("Hello");
//
//        String save = "sandip adhikari     30 software developer  ";
//        //name,age,profession
//        //20,3,20
//        //sandip adhikari     30  software developer
//        System.out.println(save.substring(0,20));
//        System.out.println(save.substring(20,23));
//        System.out.println(save.substring(23,43));
//
//        //compare the value inside of object
//        System.out.println(s1.equals(s2));
//
//        //compare the reference
//        System.out.println(s1==s2);
//        UUID uuid = UUID.randomUUID();
//        Person p1 = new Person(uuid,"Hou",45);
//
//        System.out.println(p1.equals(new Person(uuid,"Hou",47)));
       // StaticExample s1 = new StaticExample("Java","class");
        StaticExample.someInfo = "there there";




    }
}
