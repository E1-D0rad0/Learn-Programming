package com.company;
import java.util.Scanner;

public class El08_PracticeSet_1 {
    public static void main(String[] args) {

        // Question 1
        float d = 7/4.0f * 9/2.0f;
        System.out.println(d);

        // Question 2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the Grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        // Question 3
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(b>8);

        // Question 4
        int c;
        int v = 5;
        int u = 6;
        int a = 8;
        int s = 4;
        c = (v*v - u*u)-(2*a*s);
        System.out.println(c);
    }
}
