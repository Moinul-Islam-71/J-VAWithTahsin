package com.company.AnnotatioN;

public class Goku implements AnimeCharacter{
    @VeryImportant
    String name;


    public Goku(String name){
        this.name = name;
    }

    @VeryImportant
    @Override
    public void powerLevel(){
        System.out.println("10, 00, 000");
    }

    @VeryImportant
    @MultipleCallPermission(times = 2)
    @RunImmediately
    @Override
    public String getName(){
        return name;
    }
}
