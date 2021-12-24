package com.company;

public class El10_StringMethods {
    public static void main(String[] args) {
        String name = "IdK";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     idk      ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(1));
        System.out.println(name.substring(0,3));

        System.out.println(name.replace('d','p'));
        System.out.println(name.replace("Id","Np"));

//        System.out.println(name.startsWith("Id"));
//        System.out.println(name.endsWith("dK"));

        System.out.println(name.charAt(1));
        System.out.println(name.indexOf("d"));

//        System.out.println(name.equals("IdK"));
//        System.out.println(name.equals("idk"));
//        System.out.println(name.equalsIgnoreCase("idk"));

        System.out.println("\nI am escape sequence \"double quote\"");
    }
}
