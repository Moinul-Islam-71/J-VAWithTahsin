package com.company.LambdaExpression.Format3;

public class Main {
    public static void main(String[] args) {

        //The Original format...
        printThing(new Printable() {
            @Override
            public void print() {
                System.out.println("Without Lambda but with AnonymousClass");
                System.out.println("Meow");
            }
        });

        //Doing the previous work with LambdaExpression...
        printThing(() -> {
            System.out.println("\nWith LambdaExpression...");
            System.out.println("Meow");
        });
    }

    public static void printThing(Printable object) {
        object.print();
    }
}
