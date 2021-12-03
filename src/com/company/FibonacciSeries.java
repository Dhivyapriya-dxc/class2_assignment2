package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        // Logic to find out the fibonacci series of a given number
        Scanner sn = new Scanner(System.in);
        int previousNum = 0;
        int nextNum = 1;
        int num;

        System.out.println("Find out the fibonacci series based on your input number");
        System.out.println("--------------------------------------------------------");
        System.out.println("How many numbers you want in Fibonacci series : ");

        if(sn.hasNextInt()) {
            num = sn.nextInt();
            System.out.print("Fibonacci Series of " + num + " numbers : ");
        }
        else
        {
            System.out.println("Oops! The entered value is not a whole number.");
            return;
        }

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(previousNum+" ");
            /* On each iteration, second number is assigned to the first number
             and assigning the sum of the last two numbers to the second number
             */

            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }
    }
}
