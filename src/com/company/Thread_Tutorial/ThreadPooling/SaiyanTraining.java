package com.company.Thread_Tutorial.ThreadPooling;

public class SaiyanTraining implements Runnable {
    private String task;

    SaiyanTraining(String task) {
        this.task = task;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " " + task + " শুরু করেছে!");
        try {
            Thread.sleep(4000); // কিছু সময়ের জন্য থ্রেডটি ট্রেনিং করছে
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " " + task + " শেষ করেছে!");
    }
}
