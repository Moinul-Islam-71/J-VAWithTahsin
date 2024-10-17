/**
 * এই প্যাকেজটি তারিখ ও সময়ের সাথে সম্পর্কিত বিভিন্ন ফিচার এবং
 * কার্যকারিতা সরবরাহ করে। এতে ডিফল্ট এবং স্ট্যাটিক মেথড ব্যবহার
 * করে টাইম জোন এবং ফরম্যাটেড তারিখ ও সময়ের ব্যবস্থাপনা করা হয়।
 *
 * @author Moinul Islam
 * @date Thu, Oct 17 2024
 */
package com.company.InterfaceTutorial.DateTime_with_Default_and_StaticMethods;

import java.time.*;
import java.time.format.DateTimeFormatter; // DateTimeFormatter ক্লাসটি ইম্পোর্ট করা হচ্ছে

/**
 * এই ইন্টারফেসটি বিভিন্ন তারিখ এবং সময় সেট করা ও ফেরত দেওয়ার জন্য ব্যবহৃত হয়।
 * এতে তারিখ, সময় ও তারিখসহ সময় সেট করার জন্য মেথড রয়েছে এবং নির্দিষ্ট ফরম্যাটে সময় ফেরত দেওয়ার জন্য মেথড প্রদান করা হয়েছে।
 */
@Preamble(date = "Thu, Oct 17 2024", author = "Moinul Islam", currentRevision = 1, lastModified = "N\\A", reviewers = "Null")

 /** @author Moinul Islam
 * @date Thu, Oct 17 2024
 * @currentRevision 1
 * @lastModified N\A
 * @reviewers Null
 */
public interface TimeClient {

    /**
     * নির্দিষ্ট দিন, মাস এবং বছর সেট করার মেথড।
     *
     * @param day দিন
     * @param month মাস
     * @param year বছর
     */
    void setDate(int day, int month, int year);

    /**
     * নির্দিষ্ট ঘন্টা, মিনিট এবং সেকেন্ড সেট করার মেথড।
     *
     * @param hour ঘন্টা
     * @param minute মিনিট
     * @param second সেকেন্ড
     */
    void setTime(int hour, int minute, int second);

    /**
     * নির্দিষ্ট দিন, মাস, বছর এবং সময় (ঘন্টা, মিনিট, সেকেন্ড) একসাথে সেট করার মেথড।
     *
     * @param day দিন
     * @param month মাস
     * @param year বছর
     * @param hour ঘন্টা
     * @param minute মিনিট
     * @param second সেকেন্ড
     */
    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);

    /**
     * বর্তমান তারিখ ও সময় LocalDateTime অবজেক্ট হিসেবে ফেরত দেয়।
     *
     * @return LocalDateTime বর্তমান তারিখ ও সময়
     */
    LocalDateTime getLocalDateAndTime();

    /**
     * নির্দিষ্ট ফরম্যাটে তারিখ ও সময় স্ট্রিং হিসেবে ফেরত দেয়।
     *
     * @return String ফরম্যাট করা তারিখ ও সময়
     */
    String getFormattedDateTime();

    /**
     * একটি স্ট্যাটিক মেথড, যা নির্দিষ্ট জোন স্ট্রিং থেকে ZoneId অবজেক্ট ফেরত দেয়।
     * যদি ভুল জোন স্ট্রিং দেওয়া হয়, তাহলে ডিফল্ট সিস্টেম টাইম জোন ব্যবহার করবে।
     *
     * @param zoneString টাইম জোনের স্ট্রিং
     * @return ZoneId টাইম জোন অবজেক্ট

     *Static এবং default মেথডের সুবিধাগুলি ইন্টারফেসে বিশেষ করে জাভার মতো প্রোগ্রামিং ল্যাঙ্গুয়েজে বেশ গুরুত্বপূর্ণ।
     * নিচে এই দুটি মেথডের ইন্টারফেসে ব্যবহার করার প্রধান সুবিধাগুলি ব্যাখ্যা করা হলো:

     * 1. Default Method:
     *
     * Default মেথড ইন্টারফেসে নতুন ফিচার যোগ করার একটি উপায়। ইন্টারফেসে default মেথড যোগ করার ফলে পুরোনো
     * ইমপ্লিমেন্টেশন পরিবর্তন না করেই নতুন ফিচার যোগ করা যায়।
     *
     * সুবিধাসমূহ:
     * - Backward Compatibility: পুরোনো ইমপ্লিমেন্টেশন ভাঙার প্রয়োজন নেই। অর্থাৎ, ইন্টারফেসে নতুন মেথড
     *   যোগ করলে পুরোনো কোডগুলো ঠিক থাকবে। প্রোগ্রামারদের তাদের ক্লাসগুলো আপডেট করতে হবে না।
     * - Code Reuse: ইন্টারফেসের মধ্যে সাধারণ লজিক দেওয়া যায়, যেটি সব ইমপ্লিমেন্টিং ক্লাস শেয়ার করতে পারে।
     * - Optional Implementation: যারা ইন্টারফেস ইমপ্লিমেন্ট করে, তারা ইচ্ছা করলে default মেথডের ডিফল্ট
     *   ইমপ্লিমেন্টেশন ব্যবহার করতে পারে, অথবা চাইলে ওভাররাইড করতে পারে।
     *
     * উদাহরণ:
     * <pre>
     * public interface Vehicle {
     *     void start();
     *
     *     default void fly() {
     *         System.out.println("This vehicle can fly!");
     *     }
     * }
     *
     * class Car implements Vehicle {
     *     public void start() {
     *         System.out.println("Car is starting.");
     *     }
     * }
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         Car myCar = new Car();
     *         myCar.start();
     *         myCar.fly();  // Default method is called
     *     }
     * }
     * </pre>
     * এখানে, Car ক্লাসে fly() মেথড না থাকা সত্ত্বেও এটি ইন্টারফেসের default মেথড কল করে।
     *
     * 2. Static Method:
     *
     * Static মেথড ইন্টারফেসে এমন মেথড যুক্ত করার একটি উপায় যা কোনো নির্দিষ্ট ইমপ্লিমেন্টেশনের উপর নির্ভর করে না।
     * এটি ক্লাসের মতোই সরাসরি ইন্টারফেস থেকে কল করা যায়।
     *
     * সুবিধাসমূহ:
     * - Utility Methods: কিছু নির্দিষ্ট কাজ (যেমন: কনভার্সন, টুল মেথড) যা কোনো নির্দিষ্ট ইমপ্লিমেন্টেশনের উপর নির্ভর করে না,
     *   তা সরাসরি ইন্টারফেস থেকে সরবরাহ করা যায়।
     * - Code Organization: ইন্টারফেসের সাথে সম্পর্কিত static মেথডগুলো ইন্টারফেসের মধ্যে রাখতে পারলে কোড বেশি
     *   সংগঠিত হয়, এবং আলাদা ক্লাসে এগুলো রাখার প্রয়োজন হয় না।
     * - No Need for Instance: ইন্টারফেসের static মেথড কল করার জন্য কোনো ইমপ্লিমেন্টেশন ক্লাসের অবজেক্ট তৈরি করতে হয় না।
     *   ইন্টারফেসের মাধ্যমেই সরাসরি মেথড কল করা যায়।
     *
     * উদাহরণ:
     * <pre>
     * public interface MathUtility {
     *     static int add(int a, int b) {
     *         return a + b;
     *     }
     * }
     *
     * public class Main {
     *     public static void main(String[] args) {
     *         int result = MathUtility.add(5, 10);  // Static method call
     *         System.out.println("Result: " + result);
     *     }
     * }
     * </pre>
     * এখানে MathUtility.add() একটি static মেথড যা সরাসরি ইন্টারফেস থেকে কল করা হয়েছে, অবজেক্ট তৈরি না করেই।
     * সংক্ষেপে:
     * - Default মেথড: ইন্টারফেসে নতুন ফিচার যুক্ত করে পুরোনো ইমপ্লিমেন্টেশনের সাথে সামঞ্জস্য রেখে। ক্লাসগুলো চাইলে এই মেথড ওভাররাইড করতে পারে।
     * - Static মেথড: ইন্টারফেসের সাথে সম্পর্কিত স্ট্যাটিক টুল বা ইউটিলিটি মেথড সরাসরি ইন্টারফেস থেকে কল করা যায়, অবজেক্ট তৈরি না করেই।
     *
     * এরা ইন্টারফেসের ফ্লেক্সিবিলিটি এবং পুনর্ব্যবহারের ক্ষমতা বাড়ায়, যা কোডের রক্ষণাবেক্ষণ এবং নতুন ফিচার যোগ করার ক্ষেত্রে গুরুত্বপূর্ণ।
     */

    static ZoneId getZoneID(String zoneString) {
        try {
            return ZoneId.of(zoneString);
        } catch (DateTimeException e) {
            System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
            return ZoneId.systemDefault();
        }
    }

    /**
     * নির্দিষ্ট টাইম জোন অনুসারে ZonedDateTime অবজেক্ট ফেরত দেয়।
     *
     * @param zoneString টাইম জোনের স্ট্রিং
     * @return ZonedDateTime নির্দিষ্ট টাইম জোনের তারিখ ও সময়
     */
    default ZonedDateTime getZonedDateTime(String zoneString) {
        return ZonedDateTime.now(getZoneID(zoneString));
    }

    /**
     * নির্দিষ্ট টাইম জোন অনুসারে ফরম্যাট করা ZonedDateTime স্ট্রিং হিসেবে ফেরত দেয়।
     *
     * @param zoneString টাইম জোনের স্ট্রিং
     * @return String ফরম্যাট করা ZonedDateTime
     */
    default String getFormattedZonedDateTime(String zoneString) {
        ZonedDateTime zonedDateTime = getZonedDateTime(zoneString);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("hh:mm a E, MMM dd yyyy");
        return zonedDateTime.format(myFormatObj);
    }
}
