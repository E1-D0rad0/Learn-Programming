package com.company;
import java.util.Scanner;

public class El09_Strings {
    public static void main(String[] args) {
//        String st = new String("Lol");
        String s = "Lol";
        System.out.print("The name is: ");
        System.out.print(s);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %.2f ", a, b);
        System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
    }
}
