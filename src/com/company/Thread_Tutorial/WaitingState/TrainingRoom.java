package com.company.Thread_Tutorial.WaitingState;

public class TrainingRoom {
    public synchronized void accessRoom(String warrior) {
        System.out.println(warrior + " ট্রেনিং রুমে প্রবেশ করলো...");
        try {
            Thread.sleep(2000);
            System.out.println(warrior + " ট্রেনিং করছে...");
            Thread.sleep(6000);
            System.out.println(warrior + " ট্রেনিং শেষ হলো...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
