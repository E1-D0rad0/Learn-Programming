package com.company;

public class El13_LogicalOperators {
    public static void main(String[] args) {
        /* Logical Operators
            && ---> AND
            || ---> OR
            !  ---> NOT
         */
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = true;
        if (a && b) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For Logical OR...");
        boolean c = true;
        boolean d = false;
        if (c || d) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        System.out.println("For Logical NOT...");
        System.out.print("Not(c) is ");
        System.out.println(!c);
        System.out.print("Not(d) is ");
        System.out.println(!d);
    }
}
