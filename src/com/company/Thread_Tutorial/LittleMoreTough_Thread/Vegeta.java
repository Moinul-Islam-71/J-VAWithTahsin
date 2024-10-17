package com.company.Thread_Tutorial.LittleMoreTough_Thread;

public class Vegeta extends Thread {
    DragonBall dragonBall;

    public Vegeta(DragonBall dragonBall) {
        this.dragonBall = dragonBall;
    }

    public void run() {
        dragonBall.collectBall("Vegeta");
    }
}