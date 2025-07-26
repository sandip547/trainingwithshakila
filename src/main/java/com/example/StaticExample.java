package com.example;


//static is keyword that you can use with class,methods,instance variables
//static keyword is related with classname
public class StaticExample {
    public  static String someConfigration;

    static {
        someConfigration = "Database connection initilized";
        System.out.println(someConfigration);
    }
    String inf;
    String inf1;
    public static String someInfo;
    public String getInf() {
        return inf;
    }

    public String getInf1() {
        return inf1;
    }

    public static String getSomeInfo() {
        return someInfo;
    }

    public StaticExample(String inf, String inf1){

        this.inf = inf;
        this.inf1 = inf1;
        System.out.println(
                inf + inf1
        );

    }

    //new StaticExample(info1,info2,info3,someInfo)
    //new StaticExample(info1,info2,info3,someInfo)
    // 20000 -> 20000 ->someInfo will be in a memory
    public static void main(String[] args) {



        StaticExample s1 = new StaticExample("Java","class");

        StaticExample s2 = new StaticExample("python","class");

        System.out.println(Thread.currentThread().getName());

    }
}
