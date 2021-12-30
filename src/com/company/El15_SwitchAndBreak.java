package com.company;
import java.util.Scanner;

public class El15_SwitchAndBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Tell Us How old You are :");
        int age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to be an Adult");
                break;
            case 23:
                System.out.println("You are going to get a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your Life!");
        }
    }
}
