package com.company;
import java.util.Scanner;

public class El16_PracticeSet_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem 1
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }

        // Problem 2
        System.out.println("Enter your Physics marks");
        byte phy = sc.nextByte();

        System.out.println("Enter your Chemistry marks");
        byte che = sc.nextByte();

        System.out.println("Enter your Mathematics marks");
        byte mat = sc.nextByte();

        float avg = (phy+che+mat)/3.0f;
        System.out.println("Your overall percentage is: "+ avg);
        if(avg>=40 && phy>=33 && che>=33 && mat>=33){
            System.out.println("Congratulations, You have passed exams");
        }
        else{
            System.out.println("Wait, Are you kidding me!!!");
        }

        // Problem 3
        float tax = 0;
        System.out.println("Enter Your Income :");
        float income = sc.nextFloat();
        if(income>2.5f && income<5.0f){
            tax = tax + 0.05f * (income-2.5f);
        }
        else if(income>5.0f && income<10.0f){
            tax = tax + 0.2f * (income-2.5f);
        }
        else if(income>10.0f){
            tax = tax + 0.3f * (income-2.5f);
        }
        System.out.println(tax);

        // Problem 4
        System.out.println("Enter Day Num :");
        int day = sc.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("It's Not a Day");
        }

        // Problem 5
        System.out.println("Enter Current Year in 4-Digit:");
        int year = sc.nextInt();
        boolean leap = false;
        // if the year is divided by 4
        if (year % 4 == 0) {
            // if the year is century
            if (year % 100 == 0) {
                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            // if the year is not century
            else
                leap = true;
        }
        else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

        // Problem 6
        System.out.println("Enter Your Website URL:");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an Organizational Website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
    }
}
