package com.plurasight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the two numbers from the user
        System.out.print("Enter the first number: ");
        float num1 =scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 =scanner.nextFloat();
// Step 2: Show operation options
        System.out.println("Possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select a option: ");
        String option =scanner.next();
        System.out.println(num1+""+num2);


    }

}
