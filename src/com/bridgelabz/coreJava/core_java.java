package com.bridgelabz.coreJava;

import java.util.Scanner;

public class core_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int numberToCheck= sc.nextInt();

        if(numberToCheck % 2 == 0)
            System.out.println("The entered number is even");
        else
            System.out.println("The Entered number is odd");



    }
}
