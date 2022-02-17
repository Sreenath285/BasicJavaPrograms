package com.sreenath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int year;
        System.out.println("Enter an Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (year >= 1528 && year <= 2100) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("Leap year");
            }
            else {
                System.out.println("Not a leap year");
            }
        }
        else {
            System.out.println("Enter a valid year");
        }
    }
}
