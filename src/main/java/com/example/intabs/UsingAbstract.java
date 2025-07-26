package com.example.intabs;

public class UsingAbstract extends AbstractExample{
    @Override
    public String m1() {
        return "using abstract";
    }
    public String m5(){
        return "he";
    }
    @Override
    public boolean start(){
        System.out.println("Hello There");
        return false;
    }


}
