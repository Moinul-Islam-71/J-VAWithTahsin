package com.company.LambdaExpression.Format4;

public class Main {
    public static void main(String[] args) {


        printThing(
                ()-> System.out.println("Cat says: Meow...")
        );

        //উপরের ফরম্যাট আর নিচের ফরম্যাট সেইম। কিন্তু নিচে এক লাইনে লেখা হয়েছে
        printThing(()-> System.out.println("Dog says: Bow.. bow..."));
    }

    public static void printThing(Printable object) {
        object.print();
    }
}
