package com.sreenath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println(ch + " is vowel");
        }
        else {
            System.out.println(ch + " is consonant");
        }

    }
}
