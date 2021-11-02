package com.bridgelabz.coreJava;

import java.util.Scanner;

public class core_java {
    public static void main(String[] args) {
        int dividend, divisor, quotient, remainder;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  dividend");
        dividend= sc.nextInt();
        System.out.println("Enter the divisor");
        divisor= sc.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);


    }
}
