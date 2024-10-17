package com.company.Thread_Tutorial.LittleMoreTough_Thread;

public class Main {
    public static void main(String[] args) {
        DragonBall dragonBall = new DragonBall();

        Goku gokuThread = new Goku(dragonBall);
        Vegeta vegetaThread = new Vegeta(dragonBall);

        gokuThread.start();
        vegetaThread.start();
    }
}
