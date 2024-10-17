package com.company.Thread_Tutorial.ThreadPooling;

public class WebRequestHandler implements Runnable{
    private String userRequest;

    WebRequestHandler(String userRequest) {
        this.userRequest = userRequest;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + userRequest + " প্রসেস করছে...");
        try {
            Thread.sleep(2000);  // রিকোয়েস্ট প্রোসেস করতে কিছু সময় নিচ্ছে
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " " + userRequest + " প্রোসেসিং শেষ করেছে!");
    }
}
