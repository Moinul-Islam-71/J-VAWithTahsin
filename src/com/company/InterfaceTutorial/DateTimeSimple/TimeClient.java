package com.company.InterfaceTutorial.DateTimeSimple;

import java.time.*;

public interface TimeClient {
    void setTime(int hour, int minute, int second);
    void setDate(int day, int month, int year);
    void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
    LocalDateTime getLocalDateTime();
//    ZonedDateTime getZonedDateTime(String zoneString);  // নতুন মেথড যোগ করা হয়েছে
}
