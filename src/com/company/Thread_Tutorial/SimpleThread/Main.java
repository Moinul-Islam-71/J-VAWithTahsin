package com.company.Thread_Tutorial.SimpleThread;

public class Main {
    public static void main(String[] args) {
        Goku gokuThread = new Goku();
        Vegeta vegetaThread = new Vegeta();

        gokuThread.start();
        vegetaThread.start();
    }
}
