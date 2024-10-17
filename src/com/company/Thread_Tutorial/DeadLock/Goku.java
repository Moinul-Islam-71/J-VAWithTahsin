package com.company.Thread_Tutorial.DeadLock;

public class Goku extends Thread {
    Resource resource1;
    Resource resource2;

    public Goku(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            try {
                System.out.println("Goku is working on " + resource1.name);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (resource2) {
                System.out.println("Goku is working on " + resource2.name);
            }
        }
    }
}
