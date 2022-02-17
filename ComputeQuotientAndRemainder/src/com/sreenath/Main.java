package com.sreenath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter dividend and divisor values : ");
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int quotient, remainder;

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient : " + quotient);
        System.out.println("Remainder : " + remainder);

    }
}
