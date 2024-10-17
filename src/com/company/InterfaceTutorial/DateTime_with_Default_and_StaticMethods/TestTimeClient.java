package com.company.InterfaceTutorial.DateTime_with_Default_and_StaticMethods;

/**
 * এই ক্লাসটি TimeClient ইন্টারফেসের কার্যকারিতা পরীক্ষা করার জন্য ব্যবহৃত হয়।
 * এতে বিভিন্ন টাইম জোনের জন্য ফরম্যাট করা তারিখ ও সময় দেখানোর জন্য মেইন মেথড রয়েছে।
 */

@Preamble(date = "Thu, Oct 17 2024", author = "Moinul Islam", currentRevision = 1, lastModified = "N\\A", reviewers = "Null")

 /**
 * @author Moinul Islam
 * @date Thu, Oct 17 2024
 * @currentRevision 1
 * @lastModified N\A
 * @reviewers Null
 */
public class TestTimeClient {
    /**
     * প্রধান মেথড যা TimeClient ইন্টারফেসের কার্যকারিতা পরীক্ষা করে।
     * এখানে বিভিন্ন টাইম জোনের জন্য ফরম্যাট করা তারিখ ও সময় দেখানো হয়।
     *
     * @param args প্রধান মেথডের ইনপুট আর্গুমেন্ট
     */
    public static void main(String[] args) {
        // TimeClient ইন্টারফেসের একটি বাস্তবায়ন ক্লাস তৈরি করা হচ্ছে
        TimeClient timeClient = new SimpleTimeClient();

        // সিস্টেমের ডিফল্ট স্থানীয় সময় প্রদর্শন করা হচ্ছে
        System.out.println("System's Default Date&Time:\n" + timeClient.getFormattedDateTime() + "(Local Time)\n\n");

        // বিভিন্ন টাইম জোন পরীক্ষা করা হচ্ছে
        System.out.println("Time in California (America/Los_Angeles):\n" + timeClient.getFormattedZonedDateTime("America/Los_Angeles") + "\n\n");
        System.out.println("Time in Tokyo (Asia/Tokyo):\n" + timeClient.getFormattedZonedDateTime("Asia/Tokyo") + "\n\n");
        System.out.println("Time in Paris (Europe/Paris):\n" + timeClient.getFormattedZonedDateTime("Europe/Paris") + "\n\n");
    }
}
