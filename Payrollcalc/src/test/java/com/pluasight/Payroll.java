package com.pluasight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Payroll{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Ask for the user's name
        System.out.print("Enter your name: ");
        String name = input.next();

        //Step 3
        System.out.print("Enter your hours worked: ");
        float hours = input.nextFloat();

        System.out.print("Please enter your pay rate: ");
        float payRate = input.nextFloat();

        System.out.println("Employee name: " + name + ",pay rate " + payRate * hours );
    }
}
