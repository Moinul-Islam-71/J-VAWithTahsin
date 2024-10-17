package com.company.InterfaceTutorial.Simple;

public class Cat implements Animal {

    public Cat(){

    }

    @Override
    public void animalSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Munch");
    }
}