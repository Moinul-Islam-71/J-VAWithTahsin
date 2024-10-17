package com.company.AnnotatioN;

public class Vegeta implements AnimeCharacter {
    @VeryImportant
    String name;

    public Vegeta(String name){
        this.name = name;
    }

    @VeryImportant
    @Override
    public void powerLevel(){
        System.out.println("9, 98, 000");
    }

    @VeryImportant
    @RunImmediately
    @Override
    public String getName(){
        return name;
    }
}
