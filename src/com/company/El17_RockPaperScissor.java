package com.company;
import java.util.Random;
import java.util.Scanner;

public class El17_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random comp = new Random();

        int Rock = 1;
        int Paper = 2;
        int Scissor = 3;

        System.out.println("Press 1 For Rock\nPress 2 For Paper\nPress 3 For Scissor");
        int user = sc.nextInt();

        System.out.println(comp);
    }
}
