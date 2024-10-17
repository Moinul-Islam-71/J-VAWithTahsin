package com.company.InnerClassTutorial.NonStatic;

public class Goku {
    public String powerLevel = "Ultra Instinct !";

    class Gohan {
        static int x = 10;
        void showPower(){
            System.out.println("Goku's power: " + powerLevel);
        }
    }

    public static void main(String[] args) {
        Goku goku = new Goku();
        Goku.Gohan gohan = goku.new Gohan();
        gohan.showPower();
        System.out.println(Gohan.x);
    }
}
