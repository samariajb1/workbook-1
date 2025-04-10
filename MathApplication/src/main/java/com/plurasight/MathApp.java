package com.plurasight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 45000.0;
        double garySalary = 52000.0;

        double highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is $" + highestSalary);

        // Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want

        float carPrice = 920.0f;
        float truckPrice = 450.15f;

        float smallestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The Smallest Price is $ " + smallestPrice);

        //Find and display the area of a circle whose radius is 7.25

        double radius = 7.25f;
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is  " + area);

        // Find and display the square root a variable after it is set to 5.0

        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root is  " + squareRoot);

        //Find and display the distance between the points (5, 10) and (85, 50)

        int xPoints = 5,10;
        int yPoints = 85,50;

        double distance = Math.sqrt(Math.pow(5,10) + Math.pow(85,50));








    }
}