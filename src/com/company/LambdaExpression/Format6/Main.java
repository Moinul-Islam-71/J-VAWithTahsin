package com.company.LambdaExpression.Format6;

public class Main {
    public static void main(String[] args) {
        Printable lambdaEx = (p,s) -> System.out.println(p + "Meow" + s);
        printThing(lambdaEx);
    }

    public static void printThing(Printable object) {
        object.print("Cat says: ","...");
    }
}
