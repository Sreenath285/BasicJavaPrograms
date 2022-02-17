package com.sreenath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int temp = num % i;
            if (temp == 0) {
                System.out.println(i);
            }
        }
    }
}
