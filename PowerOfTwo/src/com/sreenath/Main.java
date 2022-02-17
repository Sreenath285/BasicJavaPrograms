package com.sreenath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int n = sc.nextInt();

        if(n > 0 && n < 32){
            for(int i = 1; i <= n ;i++){
                System.out.println((int)Math.pow(2,i));
            }
        }
        else{
            System.out.println("Enter N value between 0 and 32");
        }
        sc.close();
    }
}
