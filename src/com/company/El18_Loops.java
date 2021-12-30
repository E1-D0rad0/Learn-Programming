package com.company;
import java.util.Scanner;

public class El18_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // while Loop
        int i = 1;
        while (i<10){
            System.out.println(i);
            i++;
        }

        // do-while Loop
        int a = 10;
        do{
            System.out.println(a);
            a++;
        }while(a<5);

        // Problem Print n Numbers
        System.out.println("Enter Number of Natural Number you want to print:");
        int user = sc.nextInt();
        int x = 1;
        do{
            System.out.println(x);
            x++;
        }while(x<=user);

        // for Loop
        for (int j=0; j<=10; j++){
            System.out.println(j);
        }

        // Problem Print first n Odd Numbers
        System.out.println("Enter No. of Odd numbers you wanna Print");
        int n = sc.nextInt();
        for (int k=0; k<n; k++){
            System.out.println(2*k+1);
        }

        // Problem Print first n Natural even Numbers in Reverse Order
        System.out.println("Enter No. of even numbers you wanna Print");
        int r = sc.nextInt();
        for (int e=r; e>0; e--){
            System.out.println(2*e);
        }
    }
}
