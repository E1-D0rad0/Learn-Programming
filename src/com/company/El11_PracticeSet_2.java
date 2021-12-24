package com.company;

public class El11_PracticeSet_2 {
    public static void main(String[] args) {
        // Question 1
        String str1 = "OH My God!";
        System.out.println(str1.toLowerCase());

        // Question 2
        String str2 = "Replace Spaces to Underscore";
        System.out.println(str2.replace(" ","_"));

        // Question 3
        String letter = "Dear <|name|>, Thanks a lot!";
        System.out.println(letter.replace("<|name|>","John"));

        // Question 4
        String str3 = "Detect double and   many     Spaces in this string";
        System.out.println(str3.indexOf("  "));
        System.out.println(str3.indexOf("    "));

        // Question 5
        String str4 = "Dear Friend,\n\tWhat should be done Now?\n\tHmm I don't know.";
        System.out.println(str4);
    }
}
