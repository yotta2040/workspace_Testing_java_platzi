package com.example.demo;

public class StringUtil {

    public static boolean isEmpty(String string){

        if (string == null || string.trim().isEmpty()){
            return true;
        }
        return false;
    }
}
