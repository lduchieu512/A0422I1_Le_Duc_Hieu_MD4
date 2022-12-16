package com.example.ss4_bt_bai2.validate;

public class Validator {
    public static boolean checkFileType (String fileName) {
        String regexFileName = "^[\\w-\\.]+\\.(mp3|wav|ogg|m4p)$";
        return fileName.matches(regexFileName);
    }
}
