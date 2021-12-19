package com.company;
import java.util.Scanner;

public class El04_CBSEPercentageCalculator {
    public static void main(String[] args){
        System.out.println("We are calculating your Percentage");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Physics Marks");
        float phy = sc.nextFloat();

        System.out.println("Enter Your Chemistry Marks");
        float che = sc.nextFloat();

        System.out.println("Enter Your Maths Marks");
        float mat = sc.nextFloat();

        System.out.println("Enter Your English Marks");
        float eng = sc.nextFloat();

        System.out.println("Enter Your Computer Marks");
        float com = sc.nextFloat();

        float percentage = ((phy+che+mat+eng+com)/5);

        System.out.println("You got "+ percentage +"%");

    }
}
