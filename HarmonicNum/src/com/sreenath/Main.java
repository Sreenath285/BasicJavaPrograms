package com.sreenath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value : ");
        n = sc.nextInt();

        if (n > 0) {
            for (double i = 1; i <= n; i++) {
                sum += (1/i);
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Enter a valid value");
        }
        sc.close();
    }

}
