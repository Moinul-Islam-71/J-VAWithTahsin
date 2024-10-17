package com.company.LambdaExpression.Format2;

public class Main {
    public static void main(String[] args) {
        Printable cat = new Cat();
        printThing(cat);
    }

    public static void printThing(Printable object) {
        object.print();
    }
}
