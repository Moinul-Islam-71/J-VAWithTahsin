package com.company.LambdaExpression.Format7;

public class Main {
    public static void main(String[] args) {
        Printable lambdaEx = (p, s) -> {
            return p + "Meow" + s + "\n😊";
        };

        System.out.println(printThing(lambdaEx));;
    }

    public static String printThing(Printable object) {
        return object.print("Cat says: ", "...");
    }
}
