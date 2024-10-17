package com.company.Thread_Tutorial.DeadLock;

public class Main {
    public static void main(String[] args) {
        Resource resourceA = new Resource("Resource A");
        Resource resourceB = new Resource("Resource B");

        Goku gokuThread = new Goku(resourceA, resourceB);
        Vegeta vegetaThread = new Vegeta(resourceB, resourceA);

        gokuThread.start();
        vegetaThread.start();
    }
}
