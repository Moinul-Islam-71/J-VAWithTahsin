package com.company.InnerClassTutorial.LocalClass;

public class Saiyan {
    public void transform() {
        // Local Class
        class SuperSaiyan {
            private String form = "Super Saiyan Blue";

            public void showForm() {
                System.out.println("Transformation: " + form);
            }
        }

        // Local Class এর ইনস্ট্যান্স তৈরি এবং মেথড কল
        SuperSaiyan ss = new SuperSaiyan();
        ss.showForm();
    }


    public static void main(String[] args) {
        Saiyan goku = new Saiyan();
        goku.transform(); // Goku transforms into Super Saiyan Blue
    }
}
