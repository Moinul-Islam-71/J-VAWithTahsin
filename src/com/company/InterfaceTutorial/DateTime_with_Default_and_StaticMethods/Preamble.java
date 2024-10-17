package com.company.InterfaceTutorial.DateTime_with_Default_and_StaticMethods;
import  java.lang.annotation.Documented;
/**
 * Preamble একটি কাস্টম অ্যানোটেশন যা ক্লাস বা ইন্টারফেসের মেটাডাটা ধরে রাখে, যেমন: তারিখ, লেখক, বর্তমান সংশোধন এবং রিভিউয়ারের নাম।
 */
@Documented
@Preamble(date = "Thu, Oct 17 2024", author = "Moinul Islam", currentRevision = 1, lastModified = "N\\A", reviewers = "Null")
 /**
 * @author Moinul Islam
 * @date Thu, Oct 17 2024
 * @currentRevision 1
 * @lastModified N\A
 * @reviewers Null
 */

public @interface Preamble {
    /**
     * লেখকের নাম নির্দেশ করার জন্য {@code author} ফিল্ডটি ব্যবহৃত হয়।
     *
     * @return লেখকের নাম
     */
    String author();

    /**
     * কোড বা ডকুমেন্টটি তৈরির তারিখ নির্দেশ করার জন্য {@code date} ফিল্ডটি ব্যবহৃত হয়।
     *
     * @return তৈরির তারিখ
     */
    String date();

    /**
     * বর্তমান রিভিশনের নম্বর নির্দেশ করার জন্য {@code currentRevision} ফিল্ডটি ব্যবহৃত হয়।
     * ডিফল্ট মান হলো {@code 1}।
     *
     * @return বর্তমান রিভিশন নম্বর
     */
    int currentRevision() default 1;

    /**
     * সর্বশেষ পরিবর্তনের তারিখ নির্দেশ করার জন্য {@code lastModified} ফিল্ডটি ব্যবহৃত হয়।
     * ডিফল্ট মান হলো {@code "N\\A"}।
     *
     * @return সর্বশেষ পরিবর্তনের তারিখ
     */
    String lastModified() default "N\\A";

    /**
     * কোড বা ডকুমেন্টটি রিভিউ করার জন্য দায়ী ব্যক্তিদের নাম ধারণ করার জন্য
     * {@code reviewers} ফিল্ডটি ব্যবহৃত হয়।
     *
     * @return রিভিউয়ারদের নামের তালিকা
     */
    String[] reviewers();
}