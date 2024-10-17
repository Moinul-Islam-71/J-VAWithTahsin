package com.company.LambdaExpression.Format5;

public class Main {
    public static void main(String[] args) {
        Printable lambdaEx = new Printable(){
            @Override
            public void print() {
                System.out.println("Cat says: Meow...");
            }
        };

        printThing(lambdaEx);

        Printable lambdaEx1 = () -> {
            System.out.println("Dog says: Bow.. bow...");
        };

        printThing(lambdaEx1);

        Printable lambdaEx2 = () -> System.out.println("Bird says: Chriping");
        printThing(lambdaEx2);
    }

    public static void printThing(Printable object) {
        object.print();
    }
}
