package com.company.Thread_Tutorial.LittleMoreTough_Thread;

public class DragonBall {
    synchronized void collectBall(String name) {
        try {
            System.out.println(name + " is collecting Dragon Ball...");
            Thread.sleep(5000);
            System.out.println(name + " has been finished collecting Dragon Ball");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
