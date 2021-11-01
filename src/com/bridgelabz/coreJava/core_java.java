package com.bridgelabz.coreJava;

import java.util.Scanner;

public class core_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times coin flip");
        int totalFlip = sc.nextInt();


        //variables
        int count = 0;
        int head = 0;
        int tail = 0;

        //computation
        while (count != totalFlip) {
            double flip = Math.random();
            System.out.println(flip);

            if (flip < 0.5) {
                System.out.println("Head");
                head++;

            } else {
                System.out.println("Tail");
                tail++;
            }
            count++;
        }

        System.out.println("number of heads wins: " + head);
        System.out.println("number of tails wins:" + tail);

        int perHaid = (head * 100 / totalFlip);
        int perTail = (tail * 100 / totalFlip);
        System.out.println("the percentage of head win:" + perHaid);
        System.out.println("the percentage of tail win:" + perTail);
    }
}
