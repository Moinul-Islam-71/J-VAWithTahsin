package com.company.InnerClassTutorial.Static;

public class Vegeta {
    public static String powerLevel = "Ultra Ego!";

    static class Trunks {
        void showPower() {
            System.out.println("Vegeta's power: " + powerLevel);
        }
    }

    public static void main(String[] args) {
        Vegeta.Trunks trunks = new Vegeta.Trunks();
        trunks.showPower();
    }
}
