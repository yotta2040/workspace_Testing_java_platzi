package com.example.demo;

public class DateUtil {
    public static boolean isLeapYear(Integer year){

        return year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
    }
}
