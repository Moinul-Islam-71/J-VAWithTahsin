package com.company.Thread_Tutorial.WaitingState;

public class SaiyanWarrior extends Thread {
    TrainingRoom room;

    public SaiyanWarrior(TrainingRoom room) {
        this.room = room;
    }

    @Override
    public void run(){
        room.accessRoom(Thread.currentThread().getName());
    }
}
