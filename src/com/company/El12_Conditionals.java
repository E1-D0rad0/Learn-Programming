package com.company;
import java.util.Scanner;

public class El12_Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You can Drive");
        }
        else{
            System.out.println("You are too Young to Drive");
        }

        /* Relational Operators
         1. ==  2. >=  3. <=  4. !=
         */
    }
}
