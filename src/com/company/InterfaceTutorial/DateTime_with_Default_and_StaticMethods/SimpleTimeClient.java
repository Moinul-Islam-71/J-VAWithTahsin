package com.company.InterfaceTutorial.DateTime_with_Default_and_StaticMethods;
import java.time.*;
import java.time.format.DateTimeFormatter; // DateTimeFormatter ক্লাসটি ইম্পোর্ট করা হচ্ছে

/**
 * SimpleTimeClient একটি ক্লাস যা TimeClient ইন্টারফেসের বাস্তবায়ন।
 * এটি বর্তমান তারিখ এবং সময় ম্যানেজ করে এবং নির্দিষ্ট ফরম্যাটে প্রদর্শন করার জন্য প্রয়োজনীয় মেথডগুলো ধারণ করে।
 * এতে টাইম সেট করা, তারিখ সেট করা এবং দুইটি একসাথে সেট করার জন্য মেথড রয়েছে।।
 */


@Preamble(date = "Thu, Oct 17 2024", author = "Moinul Islam", currentRevision = 1, lastModified = "N\\A", reviewers = "Null")

 /**
 * @author Moinul Islam
 * @date Thu, Oct 17 2024
 * @currentRevision 1
 * @lastModified N\A
 * @reviewers Null
 */

public class SimpleTimeClient implements TimeClient {
    // স্থানীয় তারিখ এবং সময়ের জন্য LocalDateTime অবজেক্ট
    public LocalDateTime dateAndTime;

    // তারিখ এবং সময় ফরম্যাটের জন্য DateTimeFormatter অবজেক্ট
    DateTimeFormatter myFormatObj;

    // ফরম্যাট করা তারিখ এবং সময়
    String formattedDateTime;

    // কনস্ট্রাক্টর, যা স্থানীয় সময় এবং ফরম্যাট সেট করে
    public SimpleTimeClient() {
        this.dateAndTime = LocalDateTime.now(); // বর্তমান স্থানীয় সময় নেয়া হচ্ছে
        this.myFormatObj = DateTimeFormatter.ofPattern("hh:mm a E, MMM dd yyyy"); // ফরম্যাট নির্ধারণ
        this.updateFormattedDateTime(); // ফরম্যাট করা সময় আপডেট করা হচ্ছে
    }

    // ফরম্যাট করা সময় আপডেট করার মেথড
    private void updateFormattedDateTime() {
        this.formattedDateTime = dateAndTime.format(myFormatObj); // ফরম্যাটে রূপান্তর
    }

    @Override
    public void setTime(int hour, int minute, int second) {
        LocalTime timeToSet = LocalTime.of(hour, minute, second); // নতুন সময় নির্ধারণ
        LocalDate currentDate = LocalDate.from(dateAndTime); // বর্তমান তারিখ গ্রহণ
        dateAndTime = LocalDateTime.of(currentDate, timeToSet); // নতুন সময় সেট করা
        this.updateFormattedDateTime(); // ফরম্যাট করা সময় আপডেট করা হচ্ছে
    }

    @Override
    public void setDate(int day, int month, int year) {
        LocalDate dateToSet = LocalDate.of(day, month, year); // নতুন তারিখ নির্ধারণ
        LocalTime currentTime = LocalTime.from(dateAndTime); // বর্তমান সময় গ্রহণ
        dateAndTime = LocalDateTime.of(dateToSet, currentTime); // নতুন তারিখ সেট করা
        this.updateFormattedDateTime(); // ফরম্যাট করা সময় আপডেট করা হচ্ছে
    }

    @Override
    public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
        LocalDate dateToSet = LocalDate.of(day, month, year); // নতুন তারিখ নির্ধারণ
        LocalTime timeToSet = LocalTime.of(hour, minute, second); // নতুন সময় নির্ধারণ
        dateAndTime = LocalDateTime.of(dateToSet, timeToSet); // নতুন সময় এবং তারিখ সেট করা
        this.updateFormattedDateTime(); // ফরম্যাট করা সময় আপডেট করা হচ্ছে
    }

    @Override
    public LocalDateTime getLocalDateAndTime() {
        return dateAndTime; // বর্তমান তারিখ এবং সময় প্রদান
    }

    public String getFormattedDateTime() {
        return formattedDateTime; // ফরম্যাট করা সময় প্রদান
    }
}
