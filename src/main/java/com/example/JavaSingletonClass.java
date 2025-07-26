package com.example;

public class JavaSingletonClass {

    private static volatile JavaSingletonClass javaSingletonClass;

    private JavaSingletonClass(){
    }
    public static JavaSingletonClass getInstance(){
        if(javaSingletonClass==null){
            javaSingletonClass = new JavaSingletonClass();
            return javaSingletonClass;
        }
        return javaSingletonClass;
    }
}
class C{
    public static void main(String[] args) {
       JavaSingletonClass js = JavaSingletonClass.getInstance();
        System.out.println(System.identityHashCode(js));
        JavaSingletonClass js1 = JavaSingletonClass.getInstance();
        System.out.println(System.identityHashCode(js1));


    }
}