package com.sreenath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to flip the coin : ");
        int num = sc.nextInt();
        int head = 0,tail = 0;
        for(int i = 0; i < num; i++){
            if(Math.random() < 0.5){
                head++;
            }
            else{
                tail++;
            }
        }
        System.out.println("Heads : " + head);
        System.out.println("Tails : " + tail);

        int headPercentage = (head * 100)/num;
        int tailPercentage = (tail * 100)/num;
        System.out.println("Head Percentage : " + headPercentage +"%");
        System.out.println("Tail Percentage : " + tailPercentage +"%");
    }
}
