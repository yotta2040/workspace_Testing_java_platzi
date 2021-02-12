package com.example.demo;

public class StringUtil {

    public static String repeat(String str, int times) {
        StringBuilder result = new StringBuilder();

        if (times < 0)
            throw new IllegalArgumentException("negative times not Allowed");

        for (int i = 0; i < times; i++) {
            result.append(str);
        }

        return result.toString();
    }
}