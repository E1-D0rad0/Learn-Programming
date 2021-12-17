package com.company;
import java.util.Scanner;

public class El04_CBSEPercentageCalculator {
    public static void main(String[] args){
        System.out.println("We are calculating your Percentage");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Physics Marks");
        byte phy = sc.nextByte();

        System.out.println("Enter Your Chemistry Marks");
        byte che = sc.nextByte();

        System.out.println("Enter Your Maths Marks");
        byte mat = sc.nextByte();

        System.out.println("Enter Your English Marks");
        byte eng = sc.nextByte();

        System.out.println("Enter Your Computer Marks");
        byte com = sc.nextByte();

        int percentage = ((phy+che+mat+eng+com)/5);

        System.out.println("You got "+ percentage +"%");

    }
}
