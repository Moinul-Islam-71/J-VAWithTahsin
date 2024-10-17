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
