package com.company.AnonymousClass_Tutorial.Simple_AnonymousClass;

public class Main {
    public static void main(String[] args) {
        SaiyanPower goku = new SaiyanPower() {
            @Override
            public void transform() {
                System.out.println("Goku transforms into Ultra Instinct!");
            }
        };

        goku.transform(); // Goku এর নতুন শক্তি দেখানো
    }
}
