package com.company.InterfaceTutorial.DateTime_with_Default_and_StaticMethods;

import java.time.*;

/**
 * এই ইন্টারফেসটি টাইম ক্লায়েন্টের একটি এক্সটেনশন যা ভুল বা অবৈধ টাইমজোন হ্যান্ডেল করতে সক্ষম।
 * এটি টাইমজোনের সঠিকতা পরীক্ষা করে এবং ভুল হলে ডিফল্ট টাইমজোন ব্যবহার করে সময় প্রদান করে।
 * এই ক্লাসটি TimeClient ইন্টারফেসের একটি বাস্তবায়ন।
 *  এটি তারিখ এবং সময় পরিচালনার জন্য বিভিন্ন মেথড প্রদান করে।
 *  ব্যবহারকারীর সময় এবং তারিখ সেট করার ক্ষমতা রয়েছে এবং ফরম্যাট করা সময় পেতে পারে।
 */
@Preamble(date = "Thu, Oct 17 2024", author = "Moinul Islam", currentRevision = 1, lastModified = "N\\A", reviewers = "Null")
/**
 * এই ক্লাসটি TimeClient ইন্টারফেসের একটি বাস্তবায়ন।
 * এটি তারিখ এবং সময় পরিচালনার জন্য বিভিন্ন মেথড প্রদান করে।
 * ব্যবহারকারীর সময় এবং তারিখ সেট করার ক্ষমতা রয়েছে এবং ফরম্যাট করা সময় পেতে পারে।
 *
 * @author Moinul Islam
 * @date Thu, Oct 17 2024
 * @currentRevision 1
 * @lastModified N\A
 * @reviewers Null
 */

/**
 * HandleInvalidTimeZoneClient ইন্টারফেসটি TimeClient ইন্টারফেসকে সম্প্রসারিত করে,
 * যা অবৈধ টাইম জোনের সাথে কাজ করার সময় ডিফল্ট টাইম জোন ব্যবহার করে।
 * এটি ZonedDateTime এর কাজ করার সময় চেক করে।
 */
public interface HandleInvalidTimeZoneClient extends TimeClient {

    /**
     * ডিফল্ট getZonedDateTime মেথডটি সংশোধন করে।
     * এটি একটি টাইম জোন স্ট্রিং নেয় এবং ZonedDateTime প্রদান করে।
     * যদি টাইম জোন স্ট্রিং অবৈধ হয়, তবে একটি ত্রুটি বার্তা দেখায় এবং ডিফল্ট টাইম জোন ব্যবহার করে।
     *
     * @param zoneString টাইম জোনের স্ট্রিং (যেমন "America/Los_Angeles")
     * @return ZonedDateTime সংশ্লিষ্ট ZonedDateTime
     */
    @Override
    default public ZonedDateTime getZonedDateTime(String zoneString) {
        try {
            return ZonedDateTime.now(TimeClient.getZoneID(zoneString));
        } catch (DateTimeException e) {
            System.err.println("Invalid zone ID: " + zoneString + "; using the default time zone instead.");
            return ZonedDateTime.now(ZoneId.systemDefault());
        }
    }
}
