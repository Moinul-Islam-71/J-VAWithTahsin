package com.company.Thread_Tutorial.ThreadPooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolingExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2); // ৩টি থ্রেড পুল

        //গোকু এবং ভেজিটা বিভিন্ন ট্রেনিং করবে
        for (int i = 1; i <= 4; i++) {
            String saiyan;
            if (i % 2 == 0) {
                saiyan = "ভেজিটা";  // জোড় সংখ্যা হলে ভেজিটা ট্রেনিং করছে
            } else {
                saiyan = "গোকু";    // বিজোড় সংখ্যা হলে গোকু ট্রেনিং করছে
            }
            Runnable training = new SaiyanTraining(saiyan + " ট্রেনিং সেশন " + i);
            executor.execute(training); //থ্রেড পুল থেকে থেড ব্যবহার করে কাজ চলছে
        }
        executor.shutdown(); //কাজ শেষে থেড পুল বন্ধ করা হচ্ছে
    }
}
