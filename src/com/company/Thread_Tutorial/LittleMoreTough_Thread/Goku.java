package com.company.Thread_Tutorial.LittleMoreTough_Thread;

public class Goku extends Thread {
    DragonBall dragonBall;

    public Goku(DragonBall dragonBall){
        this.dragonBall = dragonBall;
    }

    public void run(){
        dragonBall.collectBall("Goku");
    }
}
