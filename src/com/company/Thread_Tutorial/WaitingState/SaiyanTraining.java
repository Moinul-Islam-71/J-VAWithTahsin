package com.company.Thread_Tutorial.WaitingState;

/*
*ওয়েটিং স্টেট হলো একটি অবস্থা যেখানে একটি থ্রেড কিছু ঘটনার জন্য অপেক্ষা করছে।
*যেমন, একটি synchronized ব্লক বা wait() মেথডের মাধ্যমে অন্য থ্রেডের সম্পন্ন হওয়া অপেক্ষায় আছে।
*এই সময় থ্রেডটি সক্রিয় থাকে না এবং CPU থেকে বাদ পড়ে যায়।


*ধরো, গোকু এবং ভেজিটা দুজনেই একই সময়ে একটি রুমে ঢুকে ট্রেনিং করতে চায়।
* কিন্তু রুমের নিয়ম হলো, একসাথে একজনই রুমে ট্রেনিং করতে পারবে।
* এই রুমটা হলো আমাদের shared resource।

*ওয়েটিং স্টেটের উদাহরণ:
*গোকু যদি আগে রুমে ঢুকে ট্রেনিং শুরু করে,
*তাহলে ভেজিটা বাইরে দাঁড়িয়ে থাকবে এবং অপেক্ষা করবে যতক্ষণ না
* গোকু তার ট্রেনিং শেষ করে বের হয়। ভেজিটা তখন ওয়েটিং স্টেট-এ থাকবে।

*এই উদাহরণে কী হচ্ছে:
*SharedResource হলো সেই ট্রেনিং রুম, যেখানে একসাথে একজনই ঢুকতে পারে।
*যখন গোকু বা ভেজিটা ট্রেনিং করতে চায়, তারা accessResource মেথড কল করে।
* এই মেথডটি synchronized, তাই একবারে একজনই এই মেথড ব্যবহার করতে পারবে।
*
 */


public class SaiyanTraining {
    public static void main(String[] args) {
        TrainingRoom room = new TrainingRoom();

        SaiyanWarrior goku = new SaiyanWarrior(room);
        SaiyanWarrior vegeta = new SaiyanWarrior(room);

        goku.setName("Goku");
        vegeta.setName("Vegeta");

        goku.start();
        vegeta.start();
    }
}
