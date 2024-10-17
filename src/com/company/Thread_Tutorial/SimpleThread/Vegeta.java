package com.company.Thread_Tutorial.SimpleThread;

public class Vegeta extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("ভেজিটা ট্রেনিং করছেঃ লেভেল " + i);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
