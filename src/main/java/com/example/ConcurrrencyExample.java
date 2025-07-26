package com.example;

public class ConcurrrencyExample implements Runnable {

    private String file;

    public ConcurrrencyExample(String file) {
        this.file = file;
    }

    @Override
    public void run(){
        try {
            Thread.sleep(5000);
            //code
            System.out.println("Thread name:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String [] files = {"file1","file2","file3"};
        Thread t = new Thread();
        t.run();

        for (String file:files){
            ConcurrrencyExample concurrrencyExample = new ConcurrrencyExample(file);
            concurrrencyExample.run();
        }
    }
}
