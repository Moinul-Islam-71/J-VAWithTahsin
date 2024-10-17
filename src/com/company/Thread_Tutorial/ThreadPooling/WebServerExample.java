package com.company.Thread_Tutorial.ThreadPooling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServerExample {
    public static void main(String[] args) {
        // থ্রেড পুল তৈরি, যেখানে ৩টি থ্রেড থাকবে
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // ধরো, ৬ জন ব্যবহারকারী একসাথে রিকোয়েস্ট পাঠাচ্ছে
        String[] userRequests = {"User 1 - পণ্য দেখছে", "User 2 - চেকআউট করছে",
                "User 3 - লগইন করছে", "User 4 - সার্চ করছে",
                "User 5 - প্রোফাইল এডিট করছে", "User 6 - রিভিউ দিচ্ছে"};

        // প্রতিটি রিকোয়েস্ট থ্রেড পুলে পাঠানো হচ্ছে প্রসেস করার জন্য
        for (String request : userRequests) {
            WebRequestHandler handler = new WebRequestHandler(request);
            executor.execute(handler);  // থ্রেড পুলের একটি থ্রেড এই কাজ করবে
        }

        // সব কাজ শেষে থ্রেড পুল বন্ধ করা হচ্ছে
        executor.shutdown();
    }
}
